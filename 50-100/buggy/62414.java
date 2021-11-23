public com.google.gwt.query.client.GQuery replaceWith(java.lang.String html) {
    for (com.google.gwt.dom.client.Element el : elements) {
        com.google.gwt.dom.client.Element nextSibling = el.getNextSiblingElement();
        if (nextSibling != null) {
            com.google.gwt.query.client.GQuery.$(nextSibling).before(html);
        }else {
            com.google.gwt.dom.client.Element parent = el.getParentElement();
            com.google.gwt.query.client.GQuery.$(parent).append(html);
        }
        com.google.gwt.query.client.GQuery.$(el).remove();
    }
    return this;
}