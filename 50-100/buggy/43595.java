@java.lang.Override
public boolean equals(java.lang.Object otherCustomer) {
    if (!(otherCustomer instanceof Customer)) {
        return false;
    }else {
        Customer myCustomer = ((Customer) (otherCustomer));
        return this.getName().equals(myCustomer.getName());
    }
}