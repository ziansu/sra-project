public void getInsideCall(CallListener callListener) {
    callListenerThread.suspend();
    boolean isReceiveCall = popUpWindow.acceptOrRejectMessage(callListener.getRemoteNick(), callListener.getRemoteAddress());
    if (isReceiveCall) {
        dialogPanel.setRemoteNick(callListener.getRemoteNick());
        dialogPanel.setRemoteAddress(callListener.getRemoteAddress());
        setConnectButtonEnabled(false);
        setDisconnectAndSendButtonEnabled(true);
        clearMessageList();
    }
    callListenerThread.setReceive(isReceiveCall);
    callListenerThread.resume();
}