private java.lang.String getEtag(java.lang.String header) {
    if (header != null) {
        java.util.regex.Matcher matcher = uuidPatern.matcher(header);
        if (matcher.find()) {
            return matcher.group(1);
        }
    }
    return null;
}