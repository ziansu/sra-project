private java.lang.String removeComment(java.lang.String line) {
    if (java.lang.Character.toString(line.charAt(0)).equals("%")) {
        return "%";
    }
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[^\\\\]%");
    java.util.regex.Matcher m = pattern.matcher(line);
    if (!(m.find())) {
        return line;
    }
    return line.substring(0, ((m.start()) + 2));
}