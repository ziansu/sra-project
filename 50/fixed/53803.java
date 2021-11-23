public static int getChildValueInt(org.w3c.dom.Element parent, java.lang.String name) throws javax.xml.xpath.XPathExpressionException {
    java.lang.Integer i = fi.muikku.plugins.dnm.parser.DeusNexXmlUtils.getChildValueInteger(parent, name);
    return i == null ? 0 : i.intValue();
}