private org.apache.regexp.RE buildPattern(org.w3c.dom.Element root, java.lang.String elementName) throws java.lang.ClassNotFoundException {
    org.w3c.dom.Node node = root.getElementsByTagName(elementName).item(0);
    java.lang.String pattern = "\\b9876546321\\b";
    if (node != null) {
        pattern = this.buildPattern(((org.w3c.dom.Element) (node)));
    }
    net.java.dev.jminimizer.util.XMLMethodInspector.log.debug(("Pattern compiled: " + pattern));
    java.lang.System.out.println(pattern);
    return new org.apache.regexp.RE(pattern);
}