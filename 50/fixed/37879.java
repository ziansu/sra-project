public void updateCustomer() {
    tempSession = createSession();
    java.lang.System.out.println("--> Begin transaction");
    tempSession.beginTransaction();
    chooseAttributeToChange(getCustomerById(tempSession));
    java.lang.System.out.println("--> Updating customer data");
    commitSession(tempSession);
    java.lang.System.out.println("--> Update done.");
}