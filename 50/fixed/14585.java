public void disconnect() {
    if ((myController) == null) {
        return ;
    }
    if (myController.isConnected()) {
        myController.disconnect();
    }
}