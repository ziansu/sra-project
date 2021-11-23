static javax.xml.crypto.dsig.dom.DOMValidateContext extractValidationContext(org.w3c.dom.Element element) throws javax.xml.crypto.dsig.XMLSignatureException {
    org.w3c.dom.NodeList nl = element.getElementsByTagNameNS(javax.xml.crypto.dsig.XMLSignature.XMLNS, "Signature");
    if ((nl.getLength()) == 0) {
        com.completetrsst.crypto.xml.SignatureUtil.log.debug("Could not find XML signature element");
        throw new javax.xml.crypto.dsig.XMLSignatureException("Could not find XML Signature element");
    }
    return new javax.xml.crypto.dsig.dom.DOMValidateContext(new com.completetrsst.crypto.xml.KeyValueKeySelector(), nl.item(0));
}