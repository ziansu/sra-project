private void setupMainUI() {
    if (this.memberType.equals("Patient"))
        this.patientSelectComboBox.setVisible(false);
    else {
        this.patientSelectComboBox.setVisible(true);
        this.setupComboBox(patientSelectComboBox, this.HCMS.getPatientsAssigned(this.userReferenceNumber));
    }
    setupSlider();
}