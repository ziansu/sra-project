private static void setGroupAttr(final org.w3c.dom.Element lectureElement, final org.w3c.dom.Element hasGroupElement, final java.lang.String group) {
    hasGroupElement.setAttribute("group", group);
    if ((lectureElement != null) && (!(lectureElement.hasAttribute("group"))))
        lectureElement.setAttribute("group", java.lang.String.valueOf((10 * ((java.lang.Integer.parseInt(group)) % 10))));
    
}