public static boolean isPhoneNumber(java.lang.String s) {
    if (Controller.Validate.Validate.isNotEmpty(s)) {
        return !((((s.length()) > 13) || ((s.charAt(0)) != '0')) || ((s.charAt(1)) != '0'));
    }
    return false;
}