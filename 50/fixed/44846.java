public void closeTag() {
    if ((modified) && (Configuration.autoSaveTagModifications.get())) {
        saveText(false);
    }
    textTag = null;
}