@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onMessagesCallFinished(com.bitlove.fetlife.event.ServiceCallFinishedEvent serviceCallFinishedEvent) {
    if ((serviceCallFinishedEvent.getServiceCallAction()) == (com.bitlove.fetlife.model.service.FetLifeApiIntentService.ACTION_APICALL_MESSAGES)) {
        setMessagesRead();
        oldMessageLoadingInProgress = false;
        messagesAdapter.refresh();
        dismissProgress();
    }
}