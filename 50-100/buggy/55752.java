private void doEnter() {
    final com.android.internal.telephony.PhoneBase pb = ((com.android.internal.telephony.PhoneBase) (((com.android.internal.telephony.PhoneProxy) (mPhone)).getActivePhone()));
    pb.mCi.setDataAllowed(true, obtainMessage(com.android.internal.telephony.dataconnection.DcSwitchStateMachine.EVENT_DATA_ALLOWED, (++(mCurrentAllowedSequence)), 0));
    com.android.internal.telephony.dataconnection.DctController.getInstance().resetDdsSwitchNeededFlag();
    if (pb.mDcTracker.getAutoAttachOnCreation()) {
        if (com.android.internal.telephony.dataconnection.DcSwitchStateMachine.DBG)
            log("AttachingState executeAll due to autoAttach");
        
        com.android.internal.telephony.dataconnection.DctController.getInstance().executeAllRequests(mId);
    }
}