private java.lang.String generateRealName(java.lang.String foundName) {
    java.util.regex.Pattern p = java.util.regex.Pattern.compile("(.*?) (\\(\\w*\\))");
    java.util.regex.Matcher m = p.matcher(foundName);
    if (m.find()) {
        return m.group(1);
    }else {
        return foundName;
    }
}