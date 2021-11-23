@java.lang.Override
protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event) {
    super.resizeEvent(event);
    if (client.connection.Connection.getConnectionStatus()) {
        closeAnimation(0);
    }
}