public void sendMessage(java.net.Socket socket, de.spiderlinker.cuc.network.Datapackage msg) throws java.io.IOException {
    if ((socket != null) && (msg != null)) {
        try {
            java.lang.System.out.println(("Before sending message to -> " + socket));
            java.lang.System.out.println("Perform now: ");
            de.spiderlinker.cuc.network.utils.ConnectionUtils.performHandshake(socket);
            java.lang.System.out.println("Now writing object");
            de.spiderlinker.cuc.network.utils.ConnectionUtils.writeObject(socket, msg);
            java.lang.System.out.println("Object written");
        } catch (java.io.IOException e) {
            throw e;
        }
    }
}