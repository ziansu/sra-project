private void ControlsConfActionPerformed(java.awt.event.ActionEvent evt) {
    if ((State.controlsGUI) == null) {
        State.controlsGUI = new jpcsp.GUI.ControlsGUI();
    }
    startWindowDialog(State.controlsGUI);
}