public void loadUserInformation() {
    com.guardiansofthegalaxy.guardians_md.tuples.User currentUser = com.guardiansofthegalaxy.guardians_md.db.MedicalConfigurator.getLoginUser();
    fNameField.setText(currentUser.getFirstName());
    lNameField.setText(currentUser.getLastName());
    pagerNumberField.setText(currentUser.getSpecialty());
    positionField.setText(currentUser.getPagerNumber());
    usernameField.setText(currentUser.getUsername());
    if (currentUser.hasDoctorPrivileges())
        doctor.setSelected(true);
    else
        nurse.setSelected(true);
    
}