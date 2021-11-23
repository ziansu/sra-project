@java.lang.Override
public void setText(java.lang.String t) {
    lastLine = -1;
    error = false;
    if (((Configuration.debugMode.get()) && (t != null)) && ((t.length()) > (com.jpexs.decompiler.flash.gui.editor.LineMarkedEditorPane.truncateLimit))) {
        t = ((t.substring(0, com.jpexs.decompiler.flash.gui.editor.LineMarkedEditorPane.truncateLimit)) + "\r\n") + (com.jpexs.decompiler.flash.gui.AppStrings.translate("editorTruncateWarning").replace("%chars%", java.lang.Integer.toString(com.jpexs.decompiler.flash.gui.editor.LineMarkedEditorPane.truncateLimit)));
    }
    super.setText(t);
    setCaretPosition(0);
}