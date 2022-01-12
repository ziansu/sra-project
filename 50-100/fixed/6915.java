private java.lang.String cleanupDedicatoryPrayer(java.lang.String originalDed) {
    try {
        java.lang.String removeCommaEscapes = originalDed.replaceAll("\\\\\"", "\"");
        return org.apache.commons.lang3.StringEscapeUtils.unescapeJava(removeCommaEscapes);
    } catch (java.lang.Exception ex) {
        assert false;
        ex.printStackTrace();
    }
    return "";
}