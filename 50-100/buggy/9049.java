public java.lang.String getStringBetweenQuotationMarks(java.lang.String line) {
    line = line.replace("\t", "");
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("'(.*?)'");
    java.util.regex.Matcher matcher = pattern.matcher(line);
    if (matcher.find())
        line = matcher.group(1);
    
    return line;
}