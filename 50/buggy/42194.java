public void OpenEditor() {
    if ((editor) == null) {
        editor = new axoloti.objecteditor.AxoObjectEditor(this, false);
    }
    editor.setState(java.awt.Frame.NORMAL);
    editor.setVisible(true);
}