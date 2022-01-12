public static boolean validateIPs(final java.lang.String ipsText) {
    if (com.google.common.base.Strings.isNullOrEmpty(ipsText)) {
        return true;
    }
    java.lang.String[] lines = ipsText.split(java.lang.System.getProperty("line.separator"));
    boolean valid = true;
    for (java.lang.String line : lines) {
        valid = new IHM.validators.IPAddressValidator().validate(line);
    }
    return valid;
}