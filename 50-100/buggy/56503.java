public static void setNodeValue(org.kxml2.kdom.Element node, java.lang.String value) {
    if (value == null)
        value = "";
    
    for (int i = 0; i < (node.getChildCount()); i++) {
        if (node.isText(i)) {
            node.removeChild(i);
            node.addChild(Element.TEXT, value);
            return ;
        }
    }
    node.addChild(Element.TEXT, value);
}