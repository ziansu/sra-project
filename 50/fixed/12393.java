public void deleteCustomer() {
    tempSession = createSession();
    java.lang.System.out.println("--> Begin transaction");
    tempSession.beginTransaction();
    java.lang.System.out.println("--> Deleting customer data");
    tempSession.delete(getCustomerById(tempSession));
    java.lang.System.out.println("--> Delete done.");
    commitSession(tempSession);
}