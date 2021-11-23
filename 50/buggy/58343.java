public static synchronized ch.hearc.chatvideo.gui.JPanelChat getInstance() {
    org.junit.Assert.assertTrue(((ch.hearc.chatvideo.gui.JPanelChat.pseudo) != null));
    if ((ch.hearc.chatvideo.gui.JPanelChat.INSTANCE) == null) {
        return new ch.hearc.chatvideo.gui.JPanelChat();
    }else {
        return ch.hearc.chatvideo.gui.JPanelChat.INSTANCE;
    }
}