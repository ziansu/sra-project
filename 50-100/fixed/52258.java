public void loadUserInformation() {
    com.guardiansofthegalaxy.guardians_md.tuples.User currentUser = com.guardiansofthegalaxy.guardians_md.db.MedicalConfigurator.getLoginUser();
    fNameField.setText(currentUser.getFirstName());
    lNameField.setText(currentUser.getLastName());
    pagerNumberField.setText(currentUser.getPagerNumber());
    positionField.setText(currentUser.getSpecialty());
    usernameField.setText(currentUser.getUsername());
    if (currentUser.hasDoctorPrivileges())
        doctor.setSelected(true);
    else
        nurse.setSelected(true);
    
}