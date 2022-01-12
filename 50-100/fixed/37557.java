public void print(java.lang.String s) {
    appendConsole(s, style);
    console.setCaretPosition(console.getDocument().getLength());
    if (((trayMessageType) != null) && ((trayIcon) != null)) {
        trayIcon.displayMessage(((s.substring(0, ((s.length()) > 25 ? 25 : s.length()))) + "..."), s, trayMessageType);
    }
}