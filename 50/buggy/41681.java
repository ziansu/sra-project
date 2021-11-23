public void serve(Customer c) {
    this.currCustomer = c;
    c.serve(this.serviceTime());
}