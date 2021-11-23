public static void printCustomers(Restaurant restaurant, int tableNumberIndex) {
    if (!(restaurant.getTables().get(tableNumberIndex).getCustomers().isEmpty())) {
        int counter = 1;
        for (Customer customer : restaurant.getTables().get(tableNumberIndex).getCustomers()) {
            java.lang.System.out.println(((counter + ". ") + (customer.getName())));
        }
    }else {
        java.lang.System.out.println("Nobody is at this table, Try again please");
        return ;
    }
}