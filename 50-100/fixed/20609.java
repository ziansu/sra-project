@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    if ((working) == true) {
        java.lang.String[] ObjButtons = new java.lang.String[]{ "Yes" , "No" };
        int PromptResult = javax.swing.JOptionPane.showOptionDialog(null, "Operation pending Are you sure you want to exit?", "Orthanc Query", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == (javax.swing.JOptionPane.YES_OPTION)) {
            dispose();
        }
    }else {
        dispose();
    }
}