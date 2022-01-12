private java.lang.String packAndSignEncryptedEnvelope(java.lang.String enc, int createTime, java.lang.String nonce) {
    org.w3c.dom.Element root = org.dom4j.DocumentHelper.createElement("xml");
    root.addElement("Encrypt").addCDATA(enc);
    root.addElement("MsgSignature").addCDATA(sign(createTime, nonce, enc));
    root.addElement("TimeStamp").addCDATA((createTime + ""));
    root.addElement("Nonce").addCDATA(nonce);
    return root.asXML();
}