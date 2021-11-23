protected void provideService(java.net.Socket sock) {
    java.lang.String str = "";
    try {
        writeToSocket(sock, "Tell me what you think! \nThis writes a whole block of information to me, so write everything and then submit it, don\'t send multiple ones.\n~James");
        do {
            str = readFromSocket(sock);
            if (!(str.toLowerCase().equals("end"))) {
                gui.addText(str);
            }
        } while (!(str.toLowerCase().equals("end")) );
    } catch (java.io.IOException e) {
        gui.updateStatus("Pre-emptive Leave");
        e.printStackTrace();
    }
}