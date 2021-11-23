void openDocument(edu.utah.ece.async.sboldesigner.sbol.editor.io.DocumentIO documentIO) throws java.io.IOException, org.sbolstandard.core2.SBOLConversionException, org.sbolstandard.core2.SBOLValidationException {
    org.sbolstandard.core2.SBOLDocument doc = documentIO.read();
    doc.setDefaultURIprefix(SBOLEditorPreferences.INSTANCE.getUserInfo().getURI().toString());
    if (editor.getDesign().load(doc, null)) {
        setCurrentFile(documentIO);
    }
}