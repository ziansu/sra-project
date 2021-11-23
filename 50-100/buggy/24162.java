protected boolean commitCustomer(customerdb.Customer c) {
    java.util.Random r = new java.util.Random();
    int key = r.nextInt(100001);
    boolean wasCommitted = false;
    if (customerList.containsKey(key)) {
        commitCustomer(c);
    }else
        if (!(customerList.containsKey(key))) {
            c.setKey(key);
            customerList.put(key, c);
            wasCommitted = true;
        }
    
    return wasCommitted;
}