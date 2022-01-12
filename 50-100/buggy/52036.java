private org.eclipse.jface.text.IRegion getTarget() throws org.eclipse.core.runtime.CoreException {
    com.reprezen.swagedit.core.editor.JsonDocument doc = null;
    try {
        java.lang.String content = com.reprezen.swagedit.core.utils.DocumentUtils.getDocumentContent(file.getLocation());
        doc = createDocument();
        doc.set(content);
    } catch (java.io.IOException e) {
        return null;
    }
    if (doc == null) {
        return null;
    }
    return doc.getRegion(pointer);
}