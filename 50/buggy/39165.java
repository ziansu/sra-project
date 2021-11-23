public static boolean isEmail(java.lang.String identifier) {
    java.util.regex.Matcher matcher = us.michaelrhodes.butter.models.User.EMAIL.matcher(identifier);
    return matcher.find();
}