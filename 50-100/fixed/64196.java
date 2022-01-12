@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    com.bodyworks.zihudaily.homenews.event.ShareElementCallbackEvent shareElementEvent = createShareElementEvent();
    org.greenrobot.eventbus.EventBus.getDefault().post(shareElementEvent);
    if ((toolbar) != null) {
        toolbar.removeCallbacks(toorbarAction);
    }
    if ((getView()) != null) {
        getView().removeCallbacks(shareAction);
    }
}