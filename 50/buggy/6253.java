@java.lang.Override
public void enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent event) {
    com.vaadin.ui.Label label = new com.vaadin.ui.Label("Medication");
    this.addComponent(addStartPageNavigation());
    buttonStartPage.addClickListener(this);
    addComponent(label);
}