public java.lang.Object getPayloadXML() throws javax.script.ScriptException {
    org.apache.axiom.soap.SOAPEnvelope envelope = mc.getEnvelope();
    org.apache.axiom.soap.SOAPBody soapBody = envelope.getBody();
    org.apache.axiom.om.OMElement omElement = soapBody.getFirstElement();
    return xmlHelper.toScriptXML(omElement);
}