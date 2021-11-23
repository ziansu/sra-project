public int getPriority() {
    nu.xom.Attribute pa = _element.getAttribute("priority");
    if (pa == null)
        return Template.PRIORITY_NORMAL;
    
    return new java.lang.Integer(pa.getValue()).intValue();
}