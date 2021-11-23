private void handleReceiveCall() {
    mCurrentCallId = getActivity().getIntent().getStringExtra(ECDevice.CALLID);
    java.lang.String callPhone = getActivity().getIntent().getStringExtra(ECDevice.CALLER);
    mCallee = new nobugs.team.shopping.db.entity.User();
    mCallee.setPhone(callPhone);
    getView().showCallInView(mCallee);
}