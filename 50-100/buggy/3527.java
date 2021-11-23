private void addActionToButtonEdit(java.lang.String buttonName) {
    if (true && (buttonName == "Edit")) {
        editDrug.addClickListener(new com.vaadin.ui.Button.ClickListener() {
            private static final long serialVersionUID = 1L;

            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                java.lang.System.out.println(overviewModel.getSelectedPrescription());
                if ((overviewModel.getSelectedPrescription()) != null) {
                    overviewModel.edit();
                    editView.setPrescriptionContext(overviewModel.getPrescriptionContext());
                    ch.bfh.btx8081.w2015.black.MyMedicationApp.web.view.MyMedicationApp.navigateTo("MedicationEditView");
                }
            }
        });
    }
}