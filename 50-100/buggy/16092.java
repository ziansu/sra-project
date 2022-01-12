public static int getMaxSpd1Pt(double lat, double lon) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    util.ProxyConf.open();
    java.lang.String query = osm.Overpass.setQuery1Pt(lat, lon);
    org.w3c.dom.Document doc = osm.Overpass.getDoc(osm.Overpass.execQuery(query));
    java.util.List<java.lang.Integer> wayMaxSpd = osm.Overpass.spdLimits(doc);
    int maxSpd = wayMaxSpd.get(0);
    util.ProxyConf.close();
    return maxSpd;
}