void newPart(boolean askForURIPrefix, boolean detachCurrentFile) throws org.sbolstandard.core2.SBOLValidationException {
    org.sbolstandard.core2.SBOLDocument doc = new org.sbolstandard.core2.SBOLDocument();
    if (askForURIPrefix) {
        setURIprefix(doc);
    }
    editor.getDesign().load(doc, null);
    if (detachCurrentFile) {
        setCurrentFile(null);
    }
    updateEnabledButtons(false);
}