protected void addAllCharacters(java.lang.String s, org.xml.sax.ContentHandler handler) throws org.xml.sax.SAXException {
    if (s == null) {
        return ;
    }
    char[] chars = s.toCharArray();
    handler.characters(chars, 0, chars.length);
}