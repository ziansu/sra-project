private void shutDownButtonbuildServerButton(java.awt.event.ActionEvent evt) {
    if (!(controller.serverRunning())) {
        serverFeedback("Server was not running.");
        return ;
    }
    portTF.setText(null);
    portTF.setEditable(true);
    controller.teardownModel();
    clearRegisteredProfiles();
    controller.teardownConnection();
}