private void handleByTerminatingIfWithinDialog(android.javax.sip.ClientTransaction clientTransaction) {
    logger.debug("{} request failed because call or transaction did not exist.", clientTransaction.getRequest().getMethod());
    android.javax.sip.Dialog dialog = clientTransaction.getDialog();
    if ((dialog != null) && (!(((dialog.getState()) == (android.javax.sip.DialogState.EARLY)) || ((dialog.getState()) == (android.javax.sip.DialogState.TERMINATED))))) {
        sendByeRequest(dialog);
    }
}