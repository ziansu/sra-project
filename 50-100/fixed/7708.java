public java.lang.Double getPercentage() throws java.io.IOException, javax.xml.parsers.ParserConfigurationException {
    java.lang.String body = java.lang.String.valueOf(doInBackground());
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\d{2}.\\d{4}");
    java.util.regex.Matcher matcher = pattern.matcher(body);
    return matcher.find() ? java.lang.Double.valueOf(matcher.group(0)) : 0;
}