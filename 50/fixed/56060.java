private java.lang.String sanitize(java.lang.String xml) {
    xml = xml.replaceAll("<[^:]:[^>]>", "");
    xml = xml.replaceAll("<\\/[^:]:[^:]>", "");
    return xml;
}