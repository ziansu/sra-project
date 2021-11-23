private void saveClicked() {
    java.lang.String path = getSavePath();
    if (path == null)
        return ;
    
    try {
        kinematics.logic.PrDataForLab pData = boardDesigner.getBoardData().toPrDataForLab();
        pWriter.write(path, pData);
    } catch (kinematics.logic.InvalidDataException ex) {
        java.util.logging.Logger.getLogger(kinematics.gui.labcreator.LabCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}