public boolean handleSave(boolean immediately) {
    handleStop();
    removeAllLineHighlights();
    if (untitled) {
        return handleSaveAs();
    }else
        if (immediately) {
            return handleSave2();
        }else {
            javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
                public void run() {
                    handleSave2();
                }
            });
        }
    
    return true;
}