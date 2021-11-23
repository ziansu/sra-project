private java.lang.String writeXml(final java.util.List<org.springframework.hateoas.Link> links) {
    java.lang.String xml = "";
    try {
        xhtml.writeLinks(links);
        xml = writer.toString();
        java.lang.System.out.println(("++++ new XhtmlWriter implementation result-->" + xml));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return xml;
}