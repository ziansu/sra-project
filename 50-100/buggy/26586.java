public void setEditorInput(org.eclipse.ui.IEditorInput input) {
    org.eclipse.ui.texteditor.IDocumentProvider provider = getDocumentProvider();
    if ((this.input) != null) {
        provider.disconnect(this.input);
        uninstallGroovySemanticHighlighting();
        fSourceViewerDecorationSupport.uninstall();
        fSourceViewerDecorationSupport = null;
    }
    this.input = input;
    try {
        provider.connect(input);
    } catch (org.eclipse.core.runtime.CoreException e) {
        e.printStackTrace();
    }
}