public static boolean isSelectionEmpty() {
    com.google.gwt.dom.client.Element activeElement = org.rstudio.core.client.dom.DomUtils.getActiveElement();
    org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorNative editor = org.rstudio.studio.client.workbench.views.source.editors.text.ace.AceEditorNative.getEditor(activeElement);
    if (editor != null) {
        org.rstudio.studio.client.workbench.views.source.editors.text.ace.Selection selection = editor.getSession().getSelection();
        return selection.isEmpty();
    }
    return org.rstudio.core.client.dom.DomUtils.getSelectionText(com.google.gwt.dom.client.Document.get()).isEmpty();
}