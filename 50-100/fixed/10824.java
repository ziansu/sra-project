@java.lang.Override
public boolean closeWindow(uniol.aptgui.mainwindow.WindowId id) {
    if (id.getType().isEditorWindow()) {
        uniol.aptgui.editor.document.Document<?> doc = getDocument(id);
        if ((doc.hasUnsavedChanges()) && (askSaveDocument(id, getDocument(id)))) {
            return false;
        }
    }
    if ((activeWindow) == id) {
        activeWindow = null;
    }
    mainWindow.removeWindow(id);
    documents.remove(id);
    return true;
}