private boolean validateFields() {
    boolean isAliasOk = validateTextField(aliasNameField);
    boolean isDriverOk = true;
    boolean isUrlOk = validateTextField(urlField);
    boolean isUserOk = validateTextField(userField);
    boolean isPasswordOk = validateTextField(passwordField);
    return (((isAliasOk && isDriverOk) && isUrlOk) && isUserOk) && isPasswordOk;
}