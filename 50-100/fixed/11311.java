private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {
    cz.fidentis.controller.Comparison2Faces bc = cz.fidentis.gui.GUIController.getSelectedProjectTopComponent().getProject().getSelectedComparison2Faces();
    if ((bc.getHDP()) == null)
        return ;
    
    bc.getHDP().getInfo().setColorScheme(cz.fidentis.visualisation.ColorScheme.values()[jComboBox6.getSelectedIndex()]);
}