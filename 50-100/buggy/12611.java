private static int getIntAttr(org.w3c.dom.Element element, java.lang.String attrName) {
    if (element == null)
        return 0;
    
    try {
        return java.lang.Integer.parseInt(element.getAttribute("attrName"));
    } catch (java.lang.NumberFormatException e) {
        craftedcart.smbworkshopexporter.util.LogHelper.error(craftedcart.smbworkshopexporter.XMLConfigParser.class, java.lang.String.format("Invalid integer at %s", element.toString()));
    }
    return 0;
}