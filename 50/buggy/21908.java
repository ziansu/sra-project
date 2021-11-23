@java.lang.Override
protected void addPages() {
    org.eclipse.ui.forms.editor.IFormPage bookEditorPage = new com.b2international.library.editor.BookEditorFormPage(this, com.b2international.library.editor.BookFormEditor.id, getTitle());
    try {
        addPage(bookEditorPage);
    } catch (org.eclipse.ui.PartInitException e) {
        e.printStackTrace();
    }
}