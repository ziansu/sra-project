@java.lang.Override
public void setDefinition(java.lang.String filename, java.lang.Long start, java.lang.Long end) {
    org.eclipse.core.resources.IFile file = getFile(filename);
    if ((file != null) && (file.exists())) {
        tern.eclipse.ide.ui.utils.EditorUtils.openInEditor(file, start.intValue(), ((end.intValue()) - (start.intValue())), true);
    }
}