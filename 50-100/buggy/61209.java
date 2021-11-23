public static void startThreadPool(int start, int end) {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(((no.westerdals.PG4100.innlevering1.CarRentalApplication.CUSTOMERS) / 2));
    for (int i = start; i < end; i++) {
        no.westerdals.PG4100.innlevering1.Customer customer = new no.westerdals.PG4100.innlevering1.Customer(no.westerdals.PG4100.innlevering1.CarRentalApplication.names.get(i));
        customer.setCarRental(no.westerdals.PG4100.innlevering1.CarRentalApplication.carRental);
        customer.setCountDownLatch(no.westerdals.PG4100.innlevering1.CarRentalApplication.latch);
        executor.execute(customer);
    }
    executor.shutdown();
}