private void initComponents() {
    hl = new com.vaadin.ui.HorizontalLayout();
    hl.setHeight("330px");
    hl.addComponent(hSplitPanel);
    symjaSubmitButton.addStyleName("topbarbuttons");
    symjaSubmitButton.setImmediate(true);
    symjaSubmitButton.setEnabled(true);
    symjaSubmitButton.addClickListener(new com.vaadin.ui.Button.ClickListener() {
        private static final long serialVersionUID = -8158301975694183254L;

        @java.lang.Override
        public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
            com.pg.webapp.symja.InEqualityExample ex = new com.pg.webapp.symja.InEqualityExample();
            applyFormula();
        }
    });
}