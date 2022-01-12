public void startNewSale(java.lang.String custId) {
    customer = db.findCustomer(custId);
    receipt = new PointOfSale.Receipt(customer);
}