public int getPriority() {
    nu.xom.Attribute pa = _element.getAttribute("priority");
    if (pa == null) {
        return Template.PRIORITY_NORMAL;
    }else {
        return java.lang.Integer.parseInt(pa.getValue());
    }
}