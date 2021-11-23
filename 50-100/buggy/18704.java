public double getTotalDeliveryDistance() {
    double distance = 0;
    for (int i = 0; i >= (customers.size()); i++) {
        asgn2Customers.Customer Customer = customers.get(i);
        distance = distance + (Customer.getDeliveryDistance());
    }
    return distance;
}