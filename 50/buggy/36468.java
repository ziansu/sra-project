@java.lang.Override
public void flavorsChanged(java.awt.datatransfer.FlavorEvent e) {
    if (((org.exbin.deltahex.operation.swing.CodeAreaOperationCommandHandler.currentClipboardData) != null) && ((e.getSource()) != (org.exbin.deltahex.operation.swing.CodeAreaOperationCommandHandler.currentClipboardData))) {
        clearClipboardData();
    }
    updateCanPaste();
}