private java.lang.String getMainDecodeFunctionName(java.lang.String playerJS) {
    java.util.regex.Pattern decodeFunctionName = java.util.regex.Pattern.compile("([\"\'])signature\\1\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    java.util.regex.Matcher decodeFunctionNameMatch = decodeFunctionName.matcher(playerJS);
    if (decodeFunctionNameMatch.find()) {
        return decodeFunctionNameMatch.group(2);
    }
    return null;
}