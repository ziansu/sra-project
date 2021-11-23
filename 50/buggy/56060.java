private java.lang.String sanitize(java.lang.String xml) {
    xml = xml.replaceAll("<[^:]:[^>]>", "");
    xml = xml.replaceAll("<\\/[^:]:[^:]>", "");
    xml = xml.replaceAll("& ", "&amp; ");
    return xml;
}