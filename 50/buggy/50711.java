private void save() {
    com.laboki.eclipse.plugin.smartsave.main.EditorContext.flushEvents();
    this.editor.getSite().getPage().saveEditor(this.editor, false);
    com.laboki.eclipse.plugin.smartsave.main.EditorContext.flushEvents();
}