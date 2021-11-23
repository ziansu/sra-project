public void setSelectedUser(HospitalProfessional hp) {
    this.hp = hp;
    nameField.setText(hp.getName());
    titleField.setText(hp.getTitle());
    locationField.setText(hp.getLocation());
    idField.setText(hp.getId().toString());
}