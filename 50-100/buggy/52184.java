public void deleteBooking(java.lang.String name) {
    java.util.Iterator<Booking> bi = myBookings.iterator();
    while (bi.hasNext()) {
        Booking currentBooking = bi.next();
        if ((currentBooking.getCustomer().getName()) == name) {
            myBookings.remove(currentBooking);
            java.lang.System.out.println("deleted sucessfully");
        }
    } 
    java.lang.System.out.println("Error - could not delete");
}