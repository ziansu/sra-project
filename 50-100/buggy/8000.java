private void makePay(int vendorID, java.lang.String vendorSecretKey, java.lang.String accountID, java.lang.String amount) {
    uz.agr.agrsdk.AGRBilling agr = new uz.agr.agrsdk.AGRBilling();
    if (amount.equals("")) {
        agr.preparePayment(this, vendorID, vendorSecretKey, accountID);
    }else {
        agr.preparePayment(this, vendorID, accountID, vendorSecretKey, java.lang.Integer.parseInt(amount));
    }
}