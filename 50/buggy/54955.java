@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    editor.setSource(editorframe.getText());
    editor.undo();
}