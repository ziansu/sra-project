public void run() {
    try {
        boolean clientClosed = this.clientConnection.isClosed();
        while (!clientClosed) {
            java.util.Date date = this.sharedDate.getCurrentDate();
            this.display(date.toString());
            this.sendToClient(date);
            clientClosed = this.clientConnection.isClosed();
        } 
    } catch (java.lang.Exception e) {
        this.display(e.getMessage());
    } finally {
        this.close();
    }
}