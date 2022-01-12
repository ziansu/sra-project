public static boolean isValidClassName(java.lang.String text) {
    if ((text.length()) > 0) {
        for (java.lang.String part : text.split("\\.")) {
            if ((rocks.wallenius.joop.gui.dialog.JavaUtil.JAVA_KEYWORDS.contains(part.toLowerCase())) || (!(rocks.wallenius.joop.gui.dialog.JavaUtil.JAVA_CLASS_NAME_REGEX.matcher(part).matches()))) {
                return false;
            }
        }
    }
    return true;
}