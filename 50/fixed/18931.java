public void sendToClients(java.lang.String Message) {
    for (java.io.PrintWriter write : this.serverOutput.values()) {
        write.println(Message);
        write.flush();
    }
}