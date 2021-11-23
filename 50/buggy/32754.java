public void setEditorMode(java.lang.String modeName) {
    currentMode = ("-- " + (modeName.toUpperCase())) + " --";
    vimInputModeItem.setText(currentMode);
}