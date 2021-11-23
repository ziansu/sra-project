private boolean isXML(java.lang.String value) {
    try {
        org.apache.axiom.om.util.AXIOMUtil.stringToOM(value);
        value = value.trim();
        if ((!(value.endsWith(">"))) || ((value.length()) < 4)) {
            return false;
        }
        return true;
    } catch (javax.xml.stream.XMLStreamException ignore) {
        return false;
    } catch (org.apache.synapse.mediators.transform.OMException ignore) {
        return false;
    }
}