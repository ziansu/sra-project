protected void prepareNewCustomer(int customerNr) {
    this.toggleFields(true, true);
    this.customerUUID = null;
    this.customerNr = java.lang.String.valueOf(customerNr);
    this.kundNrTextField.setText(java.lang.String.valueOf(customerNr));
    this.initValidators();
    this.kundNrTextField.requestFocus();
    this.dirtyMarker.setClean();
}