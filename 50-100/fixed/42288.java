public void setSelectedUser(HospitalProfessional hp) {
    this.hp = hp;
    nameField.setText(this.hp.getName());
    titleField.setText(this.hp.getTitle());
    locationField.setText(this.hp.getLocation());
    idField.setText(this.hp.getId().toString());
}