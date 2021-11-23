protected void provideService(java.net.Socket sock) {
    java.lang.String str = "";
    try {
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