@java.lang.Override
void setAttribute(java.lang.String name, java.lang.String value) throws org.xml.sax.SAXException {
    if (name.equals("allow")) {
        allow = new simpleserver.config.xml.Permission(value);
    }else
        if (name.equals("name")) {
            content(value);
        }
    
}