private void binLiveItemStateChanged(java.awt.event.ItemEvent evt) {
    rmi.binLive = java.lang.String.valueOf(((int) (java.lang.Math.pow(2, binLive.getSelectedIndex()))));
}