public void refreshLighting() {
    if (lightingChanged) {
        lightingChanged = false;
        clearTempLighting();
        shineTempLighting();
    }
}