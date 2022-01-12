public void disconnect() throws java.io.IOException {
    if (!(disconnected)) {
        java.lang.System.out.println("Attempting to disconnect...");
        logMessage("Sending disconnect message...");
        ihs.apcs.spacebattle.MwnpMessage disconnect = new ihs.apcs.spacebattle.MwnpMessage(new java.lang.Integer[]{ netId , 0 }, "MWNL2_DISCONNECT", null);
        messenger.sendMessage(disconnect);
        logMessage("Ending listener...");
        listener.end();
        logMessage("Ending messenger...");
        messenger.end();
        disconnected = true;
        java.lang.System.out.println("Disconnect complete.");
    }
}