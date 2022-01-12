public void close() throws java.lang.Exception {
    if ((serial) != null) {
        super.close();
        int[] location = getPlacement();
        java.lang.String locationStr = processing.app.legacy.PApplet.join(processing.app.legacy.PApplet.str(location), ",");
        processing.app.PreferencesData.set("last.serial.location", locationStr);
        textArea.setText("");
        serial.dispose();
        serial = null;
    }
}