protected void commitCustomer(customerdb.Customer c) {
    java.util.Random r = new java.util.Random();
    while (true) {
        int key = r.nextInt(100001);
        if (!(customerList.containsKey(key))) {
            c.setKey(key);
            customerList.put(key, c);
            return ;
        }
    } 
}