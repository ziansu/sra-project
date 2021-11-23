public void run() {
    while (open) {
        try {
            java.lang.String m = dIn.readUTF();
            textView.addText((m + "\n"));
        } catch (java.lang.Exception e) {
            Client.ErrorDisplay.showError(e);
        }
    } 
    try {
        socket.close();
    } catch (java.lang.Exception err) {
        Client.ErrorDisplay.showError(err);
    }
}