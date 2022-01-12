public void addStreamKey(long key, java.lang.String name, boolean statusOnly) {
    if (!statusOnly)
        streamKeys.put(name, key);
    
    boolean retVal = true;
    disconnectButton.setEnabled(true);
    if ((waitDialog) != null) {
        waitDialog.notifyConnection();
    }
    prepareMenus();
    this.repaint();
}