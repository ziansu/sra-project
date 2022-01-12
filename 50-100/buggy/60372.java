private boolean validateFields() {
    boolean isAliasOk = validateTextField(aliasNameField);
    boolean isDriverOk = validateComboBox(driverBox);
    boolean isUrlOk = validateTextField(urlField);
    boolean isUserOk = validateTextField(userField);
    boolean isPasswordOk = validateTextField(passwordField);
    return (((isAliasOk && isDriverOk) && isUrlOk) && isUserOk) && isPasswordOk;
}