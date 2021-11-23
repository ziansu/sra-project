private void sendAndWaitOthers() {
    handler.readyToContinue();
    while (((handler.isConnected()) && (!(handler.readyToSendCells()))) && (!(handler.stopGame()))) {
        try {
            java.lang.Thread.sleep(20);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    handler.resetReadyReceived();
    postInvalidate();
}