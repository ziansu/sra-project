public static void newTextWindow() {
    TextEditorPanel temp = new TextEditorPanel(IDEWindow.numberOfTextWindows, IDEWindow.textEditor);
    IDEWindow.textEditor.addTab(("New File " + (IDEWindow.numberOfTextWindows)), temp);
}