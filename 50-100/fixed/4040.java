private void loadData() {
    co.in.mobilepay.entity.UserEntity userEntity = accountService.getUserDetails();
    previousMobile = userEntity.getMobileNumber();
    vProfileName.setText(userEntity.getName());
    if ((userEntity.getPassword()) != null) {
        vPassword.setText(userEntity.getPassword());
    }
    vEmail.setText(userEntity.getEmail());
    isPasswordChanged = false;
}