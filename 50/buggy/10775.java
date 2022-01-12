@java.lang.Override
public void terminateOnBye(boolean arg0) throws javax.sip.SipException {
    verifyDialogExistency();
    super.terminateOnBye(arg0);
}