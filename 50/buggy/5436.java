public void setEnable(boolean enable) {
    com.mousebird.maply.ChangeSet changes = new com.mousebird.maply.ChangeSet();
    setEnable(enable, changes);
    layerThread.addChanges(changes);
}