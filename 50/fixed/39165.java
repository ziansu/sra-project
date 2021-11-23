public static boolean isEmail(java.lang.String identifier) {
    return (identifier != null) && (us.michaelrhodes.butter.models.User.EMAIL.matcher(identifier).find());
}