private void openClicked() {
    try {
        java.lang.String path = getOpenPath();
        kinematics.logic.PrDataForLab pData = new kinematics.gui.ParserForLabirynth().read(path).labData;
        boardDesigner.setArmDesigner(new kinematics.gui.labcreator.ArmDesigner(pData.armData));
        boardDesigner.setLabDesigner(new kinematics.gui.labcreator.LabDesigner(pData.labData));
        revalidate();
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(kinematics.gui.labcreator.LabCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}