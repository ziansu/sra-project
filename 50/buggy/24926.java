public boolean addReservation(hotelmanager.Reserve temp) {
    boolean result = false;
    (reservationCount)++;
    if (checkReservations(temp)) {
        temp.setReserveID(reservationCount);
        reservations.add(temp);
        result = true;
    }
    return result;
}