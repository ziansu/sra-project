public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        java.lang.System.out.println("ssssss");
        joinServer = new CryptoClient(new java.net.Socket(joinIPFieldOpt.getText(), 9229));
        java.lang.System.out.println("zzzz");
        setJoinOptCompsTo(false);
        setStartCompsTo(false);
        repaint();
        setWinSizeTo(joinScreenSize);
        setJoinCompsTo(true);
    } catch (java.io.IOException e) {
        GuiUtils.PopUpMessages.errorMsg("couldn\'t connect to server!\ncheck port and\\or ip");
    }
}