private void addActionToButton(java.lang.String buttonName) {
    if (buttonName.equals("Insert")) {
        insertDrug.addClickListener(new com.vaadin.ui.Button.ClickListener() {
            private static final long serialVersionUID = 1L;

            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                ch.bfh.btx8081.w2015.black.MyMedicationApp.web.view.MyMedicationApp.navigateTo("MedicationInsertView");
            }
        });
    }
}