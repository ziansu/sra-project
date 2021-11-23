public static boolean isValid(final java.lang.String address) {
    return (address != null) && (xyz.enhorse.commons.Email.PATTERN.matcher(address).matches());
}