public void wipePayload() {
    this.bmpImage = null;
    this.inputStream = null;
    flags.remove(com.marz.snapprefs.SnapData.FlagState.COMPLETED);
    flags.add(com.marz.snapprefs.SnapData.FlagState.SAVED);
}