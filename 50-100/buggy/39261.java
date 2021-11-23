private static java.io.File extractFile(org.eclipse.ui.IEditorPart editor) {
    org.eclipse.ui.IEditorInput editorInput = editor.getEditorInput();
    if (editorInput != null) {
        org.eclipse.ui.part.FileEditorInput fileEditorInput = editorInput.getAdapter(org.eclipse.ui.part.FileEditorInput.class);
        if (fileEditorInput != null) {
            return fileEditorInput.getFile().getRawLocation().toFile();
        }
        org.eclipse.ui.ide.FileStoreEditorInput fileStoreEditorInput = editorInput.getAdapter(org.eclipse.ui.ide.FileStoreEditorInput.class);
        if (fileStoreEditorInput != null) {
            return new java.io.File(fileStoreEditorInput.getURI());
        }
    }
    return null;
}