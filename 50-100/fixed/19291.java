private static java.lang.String getName(org.w3c.dom.NodeList taglist) {
    for (int temp = 0; temp < (taglist.getLength()); temp++) {
        org.w3c.dom.Node tag = taglist.item(temp);
        org.w3c.dom.Element eTag = ((org.w3c.dom.Element) (tag));
        if (eTag.getAttribute("k").equals("name")) {
            return eTag.getAttribute("v");
        }
    }
    return "non";
}