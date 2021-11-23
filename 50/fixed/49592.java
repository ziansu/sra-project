private void buildLayout() {
    setSizeUndefined();
    setMargin(true);
    com.vaadin.ui.HorizontalLayout actions = new com.vaadin.ui.HorizontalLayout(accept, reject);
    actions.setSpacing(true);
    addComponents(actions);
}