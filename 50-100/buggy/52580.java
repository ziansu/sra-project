private void setupMainUI() {
    if (this.memberType.equals("Patient"))
        this.patientSelectComboBox.setVisible(false);
    else {
        this.setupComboBox(patientSelectComboBox, this.HCMS.getPatientsAssigned(this.userReferenceNumber));
    }
    setupSlider();
}