private java.lang.String extractValue(java.lang.String text, java.lang.String key) {
    java.lang.String pattern = java.lang.String.format("%s:\\s+([^\\s]+)", key);
    java.util.regex.Pattern pat = java.util.regex.Pattern.compile(pattern);
    java.util.regex.Matcher match = pat.matcher(text);
    if (match.find())
        return match.group(1);
    
    return "";
}