@java.lang.Override
public void onInvitationRemoved(java.lang.String invitationId) {
    if (mIncomingInvitationId.equals(invitationId)) {
        mIncomingInvitationId = null;
        switchToScreen(mCurScreen);
    }
}