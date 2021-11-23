public void getInsideCall(CallListener callListener) {
    callListenerThread.suspend();
    boolean isReceiveCall = popUpWindow.acceptOrRejectMessage(callListener.getRemoteNick(), callListener.getRemoteAddress());
    if (isReceiveCall) {
        clearMessageList();
        setConnectButtonEnabled(false);
        setDisconnectAndSendButtonEnabled(true);
        dialogPanel.setRemoteNick(callListener.getRemoteNick());
        dialogPanel.setRemoteAddress(callListener.getRemoteAddress());
    }
    callListenerThread.setReceive(isReceiveCall);
    callListenerThread.resume();
}