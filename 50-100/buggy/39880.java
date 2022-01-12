private void handleReceiveCall() {
    mCurrentCallId = getContext().getIntent().getStringExtra(ECDevice.CALLID);
    java.lang.String callPhone = getContext().getIntent().getStringExtra(ECDevice.CALLER);
    mCallee = new nobugs.team.shopping.db.entity.User();
    mCallee.setPhone(callPhone);
    getView().showCallInView(mCallee);
}