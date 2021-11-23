private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if ((updateIsPressed) == true) {
        java.awt.Component frame = null;
        int saveCheck = javax.swing.JOptionPane.showConfirmDialog(frame, "Would you like to save changes?", "Save Changes?", javax.swing.JOptionPane.YES_NO_OPTION);
        if (saveCheck == (javax.swing.JOptionPane.YES_OPTION)) {
            savePriorityLevel();
        }else
            if (saveCheck == (javax.swing.JOptionPane.NO_OPTION)) {
                dispose();
                new hmers2.StaffPatientViewer().setVisible(true);
            }
        
    }else {
        dispose();
    }
}