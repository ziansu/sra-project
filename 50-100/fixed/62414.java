public com.google.gwt.query.client.GQuery replaceWith(com.google.gwt.query.client.GQuery target) {
    for (com.google.gwt.dom.client.Element el : elements) {
        com.google.gwt.dom.client.Element nextSibling = el.getNextSiblingElement();
        if (nextSibling != null) {
            com.google.gwt.query.client.GQuery.$(nextSibling).before(target);
        }else {
            com.google.gwt.dom.client.Element parent = el.getParentElement();
            com.google.gwt.query.client.GQuery.$(parent).append(target);
        }
        com.google.gwt.query.client.GQuery.$(el).remove();
    }
    return this;
}