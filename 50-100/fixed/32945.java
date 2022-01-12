public static com.github.pixelstuermer.password4me.models.ValidationInfo validatePassword(java.lang.String password) {
    com.github.pixelstuermer.password4me.models.ValidationInfo validationInfo = new com.github.pixelstuermer.password4me.models.ValidationInfo();
    validationInfo.setLength(password.length());
    validationInfo.setHasSmallChars(com.github.pixelstuermer.password4me.utils.PasswordValidator.checkForSmallChars(password));
    validationInfo.setHasCapsChars(com.github.pixelstuermer.password4me.utils.PasswordValidator.checkForCapsChars(password));
    validationInfo.setHasNumberChars(com.github.pixelstuermer.password4me.utils.PasswordValidator.checkForNumberChars(password));
    validationInfo.setHasSpecialChars(com.github.pixelstuermer.password4me.utils.PasswordValidator.checkForSpecialChars(password));
    return validationInfo;
}