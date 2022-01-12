private boolean isXML(java.lang.String value, boolean deepCheck) {
    try {
        org.apache.axiom.om.util.AXIOMUtil.stringToOM(value);
        if ((!(value.endsWith(">"))) || ((value.length()) < 4)) {
            return false;
        }
        if (!deepCheck) {
            return true;
        }else {
            return isWellFormedXMLDeepCheck(value);
        }
    } catch (javax.xml.stream.XMLStreamException ignore) {
        return false;
    } catch (org.apache.synapse.mediators.transform.OMException ignore) {
        return false;
    }
}