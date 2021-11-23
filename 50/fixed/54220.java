public java.lang.String getFirstCustomer() {
    try {
        return customers.get(0).getName();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Error";
    }
}