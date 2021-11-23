private void buildElements(nu.xom.Element parent) {
    nu.xom.Elements els = parent.getChildElements("entry");
    for (int i = 0; i < (els.size()); i++) {
        nu.xom.Element el = els.get(i);
        els.put(el.getAttribute("id").getValue(), el);
        buildElements(el);
    }
}