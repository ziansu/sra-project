public void returnCar(java.lang.String registrationNumber) {
    synchronized(carToRentalTime) {
        carToRentalTime.remove(registrationNumber);
    }
    java.lang.System.out.println(((("Masina cu numarul: " + registrationNumber) + " a fost returnata la ") + (java.lang.System.currentTimeMillis())));
}