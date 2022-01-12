public java.lang.String FormatJsonString(java.lang.String inputContext) {
    int hasNode = inputContext.indexOf("\"type\"");
    if (hasNode != (-1)) {
        return inputContext.substring((hasNode - 1), ((inputContext.length()) - 1));
    }else {
        return null;
    }
}