public static com.google.gwt.dom.client.AnchorElement createAnchorWithBase(java.lang.String base_url) {
    com.google.gwt.dom.client.Document doc = org.chromium.distiller.DomUtil.createHTMLDocument(com.google.gwt.dom.client.Document.get());
    com.google.gwt.dom.client.BaseElement base = doc.createBaseElement();
    base.setHref(base_url);
    doc.getHead().appendChild(base);
    com.google.gwt.dom.client.AnchorElement a = doc.createAnchorElement();
    doc.getBody().appendChild(a);
    return a;
}