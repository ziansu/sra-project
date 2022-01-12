private java.lang.String writeXml(final java.util.List<org.springframework.hateoas.Link> links) {
    java.lang.String xml = "";
    try {
        xhtml.writeLinks(links);
        xml = writer.toString();
        xhtmlOld.writeLinks(links);
        java.lang.System.out.println(("++++ new XhtmlWriter implementation result-->" + xml));
        java.lang.System.out.println(("---- old XhtmlWriter implementation result-->" + (writerOld.toString())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return xml;
}