public static boolean isValidClassName(java.lang.String text) {
    if ((text.length()) > 0) {
        if ((rocks.wallenius.joop.gui.dialog.JavaUtil.JAVA_KEYWORDS.contains(text.toLowerCase())) || (!(rocks.wallenius.joop.gui.dialog.JavaUtil.JAVA_CLASS_NAME_REGEX.matcher(text).matches()))) {
            return false;
        }
    }
    return true;
}