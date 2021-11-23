public void buttonClick(com.vaadin.ui.Button.ClickEvent clickEvent) {
    int count = ((java.lang.Integer) (com.google.gwt.thirdparty.guava.common.base.Objects.firstNonNull(getSession().getAttribute("count"), 0)));
    getSession().setAttribute("count", (++count));
    layout.addComponent(new com.vaadin.ui.Label(("clicked: " + count)));
}