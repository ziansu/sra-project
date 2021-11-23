public void refreshLighting() {
    if (lightingChanged) {
        lightingChanged = false;
        if (com.dbash.models.Map.LOG)
            com.dbash.util.L.log("");
        
        clearTempLighting();
        shineTempLighting();
    }
}