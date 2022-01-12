private void systemBroadcast() {
    try {
        java.lang.String message = (inputMSG) + "\n";
        for (org.academiadecodigo.roothless.server.Server.ClientHandler c : clientHandlersList) {
            java.io.OutputStream out = c.getClientSocket().getOutputStream();
            out.write(message.getBytes());
            out.flush();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    dungeon.setCountAction(((dungeon.getCountAction()) + 1));
}