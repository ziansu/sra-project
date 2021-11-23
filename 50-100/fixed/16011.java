public static void printCustomers(Restaurant restaurant, int tableNumberIndex) {
    int counter = 1;
    for (Customer customer : restaurant.getTables().get(tableNumberIndex).getCustomers()) {
        java.lang.System.out.println(((counter + ". ") + (customer.getName())));
        counter++;
    }
}