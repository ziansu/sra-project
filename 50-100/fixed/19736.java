public boolean cancel(com.maestrano.account.RecurringBill bill) throws com.maestrano.exception.ApiException, com.maestrano.exception.AuthenticationException {
    if (((bill.getId()) != null) && (!(bill.getId().isEmpty()))) {
        com.maestrano.account.RecurringBill newBill = delete(bill.getId());
        return newBill.status.equals("cancelled");
    }
    return false;
}