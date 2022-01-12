public java.util.List<Models.Customer> findClosestCustomers() {
    java.util.List<Models.Customer> closestCustomers = new java.util.ArrayList<Models.Customer>();
    for (Models.Customer customer : getCustomers()) {
        java.lang.Double distance = Utils.LocationUtil.distance(Utils.CustomerUtil.companyLatitude, Utils.CustomerUtil.companyLongitude, customer.getLatitude(), customer.getLongitude());
        if (distance < 100) {
            closestCustomers.add(customer);
        }
    }
    return Utils.CustomerUtil.sortByUserIdAscending(closestCustomers);
}