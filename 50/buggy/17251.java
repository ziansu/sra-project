public void giveBackSeats(final int number) {
    if (((seatsAvailable) + number) > (maxAttendees)) {
        throw new java.lang.IllegalArgumentException("The number of seats exceeds the capacity");
    }
    seatsAvailable += number;
}