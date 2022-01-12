protected void changePort() {
    java.lang.String newPort = ((java.lang.String) (this.portPicker.getSelectedItem()));
    if ((newPort != null) && ((newPort.equals("Select a Serial Port")) == false)) {
        this.model.setPort(newPort);
        this.enableButton.setEnabled(true);
        this.calibrateButton.setEnabled(true);
    }else {
        this.enableButton.setEnabled(false);
    }
}