@java.lang.Override
public void Init() throws java.io.IOException, java.net.URISyntaxException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    super.Init();
    if (!(location.endsWith(".xml"))) {
        location += (!(location.endsWith("/"))) ? "/" : "";
        location += "sitemap.xml";
    }
    locationUrl_ = new java.net.URI(location);
    init_urls(locationUrl_);
    init_bugify();
}