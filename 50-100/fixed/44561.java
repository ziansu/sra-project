public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        joinServer = new CryptoClient(new java.net.Socket(joinIPFieldOpt.getText(), 9229));
        joinServer.start();
        setJoinOptCompsTo(false);
        setStartCompsTo(false);
        setWinSizeTo(joinScreenSize);
        setJoinCompsTo(true);
    } catch (java.io.IOException e) {
        GuiUtils.PopUpMessages.errorMsg("couldn\'t connect to server!\ncheck port and\\or ip");
    }
}