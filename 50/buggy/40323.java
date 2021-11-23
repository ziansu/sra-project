private java.lang.String getSelectedZone() {
    java.lang.String selected = "";
    if (this.inlocalTimeMode) {
        selected = systemButton.getText().toString();
    }else {
        selected = zoneButton.getText().toString();
    }
    return selected;
}