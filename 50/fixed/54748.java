public void warning(java.lang.String domain, java.lang.String key, org.apache.xerces.xni.parser.XMLParseException e) throws org.apache.xerces.xni.parser.XMLParseException {
    if (!(nowarning))
        throw e;
    else
        add(e);
    
}