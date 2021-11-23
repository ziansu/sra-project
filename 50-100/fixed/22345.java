private java.lang.String newRequestURI(java.lang.String requestURL) {
    java.util.regex.Matcher matcher = pattern.matcher(requestURL);
    if (matcher.matches()) {
        java.lang.String requestUrlWithoutRepresentation = matcher.group(1);
        java.lang.String representation = matcher.group(3);
        if (org.apache.commons.lang3.StringUtils.isEmpty(representation)) {
            representation = "html";
        }
        request.setAttribute("representation", representation);
        return requestUrlWithoutRepresentation;
    }
    return requestURL;
}