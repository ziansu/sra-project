@javafx.fxml.FXML
private void handleNewCustomer() {
    this.customer = mainApp.showBookingNewCustomerDialog("Ny kund");
    if ((customer) != null) {
        customer.setId(storage.generateCustomerId());
        customerField.setText((((((java.lang.Integer.toString(customer.getid())) + " ") + (customer.getFName())) + " ") + (customer.getLName())));
        customerExists = false;
    }
}