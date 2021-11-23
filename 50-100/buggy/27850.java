private java.lang.String parseAttribute(java.lang.String xml, java.lang.String attribute, int index) {
    if (xml.contains((attribute + "=\""))) {
        int a = ((xml.indexOf((attribute + "=\""), index)) + (attribute.length())) + 2;
        int b = xml.indexOf('\"', a);
        return decode(xml.substring(a, b));
    }else
        return null;
    
}