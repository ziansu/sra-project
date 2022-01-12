private void fixCtrlH() {
    javax.swing.InputMap inputMap = getInputMap();
    javax.swing.KeyStroke char010 = javax.swing.KeyStroke.getKeyStroke("typed \b");
    javax.swing.InputMap parent = inputMap;
    while (parent != null) {
        parent.remove(char010);
        parent = parent.getParent();
    } 
    if (inputMap != null) {
        javax.swing.KeyStroke backspace = javax.swing.KeyStroke.getKeyStroke("BACK_SPACE");
        inputMap.put(backspace, javax.swing.text.DefaultEditorKit.deletePrevCharAction);
    }
}