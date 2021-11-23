private void saveClicked() {
    try {
        kinematics.logic.PrDataForLab pData = boardDesigner.getBoardData().toPrDataForLab();
        java.lang.String path = getSavePath();
        pWriter.write(path, pData);
    } catch (kinematics.logic.InvalidDataException ex) {
        java.util.logging.Logger.getLogger(kinematics.gui.labcreator.LabCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}