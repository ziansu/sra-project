public void setCameraLock(final boolean s) {
    isCameraLock = s;
    notifyListeners(msi.gama.outputs.LayeredDisplayData.Changes.SPLIT_LAYER, s);
}