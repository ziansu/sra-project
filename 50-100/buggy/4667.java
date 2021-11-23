public double getDoubleFromElement(java.lang.String el) {
    double d = 0;
    java.util.regex.Pattern p = java.util.regex.Pattern.compile("(\\d+(?:\\.\\d+))");
    java.util.regex.Matcher m = p.matcher(el);
    while (m.find()) {
        d = java.lang.Double.parseDouble(m.group(1));
    } 
    return d;
}