@java.lang.Override
public void onDataCallback(com.hongyu.reward.model.BaseModel data) {
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.hongyu.reward.model.NoticeEvent(com.hongyu.reward.model.NoticeEvent.ORDER_STATUS_CHANGED));
    if (!(isAdded())) {
        return ;
    }
    if (com.hongyu.reward.http.ResponesUtil.checkModelCodeOK(data)) {
        com.hongyu.reward.utils.T.show(R.string.cancel_reward_order_success);
        getActivity().finish();
    }else {
        com.hongyu.reward.utils.T.show(com.hongyu.reward.http.ResponesUtil.getErrorMsg(data));
    }
}