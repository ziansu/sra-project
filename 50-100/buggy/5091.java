@javafx.fxml.FXML
void loadCustomerDetails(javafx.event.ActionEvent event) {
    int x = availableMotorhomesTable.getSelectionModel().getSelectedIndex();
    if (x != 0) {
        Exam.CLASS.Reservations.motorhomeSelected = columnLicese2.getCellData(x);
        Exam.CLASS.Reservations.price = columnPricePD.getCellData(x);
        java.lang.System.out.println(("motorhomeSelected: " + (Exam.CLASS.Reservations.motorhomeSelected)));
        scene.openWindowAndClose(event, "customers.fxml", "Customer details", 600, 400);
    }else {
        java.lang.System.out.println("no motorhome selected");
    }
}