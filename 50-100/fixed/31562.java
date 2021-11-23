final java.lang.Object getNum(final java.lang.String str) {
    java.util.regex.Pattern p;
    p = java.util.regex.Pattern.compile("\\d+");
    java.util.regex.Matcher m;
    m = p.matcher(str);
    if (m.find()) {
        int result = java.lang.Integer.parseInt(str.substring(m.start(), m.end()));
        return result;
    }else {
        return null;
    }
}