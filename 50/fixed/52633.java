public static org.w3c.dom.Document unEscapeCDATAXML(java.lang.String escapedXml) {
    org.w3c.dom.Document doc = nl.thehyve.ocdu.soap.ResponseHandlers.SoapUtils.simpleString2XmlDoc(escapedXml);
    return doc;
}