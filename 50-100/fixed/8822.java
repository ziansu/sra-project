public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        hostServer = new CryptoServer();
        hostServer.start();
        setHostOptCompsTo(false);
        setStartCompsTo(false);
        setWinSizeTo(hostScreenSize);
        setHostCompsTo(true);
    } catch (java.io.IOException e) {
        GuiUtils.PopUpMessages.errorMsg((("port " + (CryptoServer.port)) + " is already used!\nplease try using another port number."));
        hostPortFieldOpt.requestFocus();
    }
}