private void sendMessage() {
    try (java.io.PrintWriter out = new java.io.PrintWriter(client.getOutputStream(), true)) {
        while (client.isConnected()) {
            ru.otus.l161.app.Msg msg = output.take();
            java.lang.String json = new com.google.gson.Gson().toJson(msg);
            out.println(json);
            out.println();
        } 
    } catch (java.lang.InterruptedException | java.io.IOException e) {
        ru.otus.l161.channel.SocketClientChannel.logger.log(java.util.logging.Level.SEVERE, e.getMessage());
    }
}