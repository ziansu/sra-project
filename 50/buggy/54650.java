public static boolean validate(java.lang.String str) {
    pkgMisc.NamePWValidator.matcher = pkgMisc.NamePWValidator.usernamePattern.matcher(str);
    return pkgMisc.NamePWValidator.matcher.matches();
}