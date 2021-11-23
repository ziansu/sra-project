public boolean verifyLoginInfo(int customerID, int PIN) {
    if (((customerManager.getCustomer(customerID).getCustomerID()) == customerID) && ((customerManager.getCustomer(customerID).getPIN()) == PIN)) {
        return true;
    }
    return false;
}