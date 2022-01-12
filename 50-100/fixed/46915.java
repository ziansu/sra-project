public static java.lang.String trimStr(java.lang.Object obj) {
    if (obj == null) {
        return "";
    }
    java.lang.String str = obj.toString();
    java.util.regex.Pattern p = java.util.regex.Pattern.compile("\\t|\r|\n");
    java.util.regex.Matcher m = p.matcher(str);
    java.lang.String dest = m.replaceAll("");
    return dest;
}