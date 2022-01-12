public boolean cancel(com.maestrano.account.RecurringBill bill) throws com.maestrano.exception.ApiException, com.maestrano.exception.AuthenticationException {
    if (((bill.id) != null) && (!(bill.id.isEmpty()))) {
        com.maestrano.account.RecurringBill newBill = delete(bill.id);
        return newBill.status.equals("cancelled");
    }
    return false;
}