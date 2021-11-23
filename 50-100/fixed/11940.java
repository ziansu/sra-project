public boolean addRoomToBooking(long bookingId) {
    if ((bookingId < 1) || (bookingId > (currentBookingId))) {
        return false;
    }else
        if ((currentReservationNumber) >= (MAX_ROOMS)) {
            return false;
        }else {
            ++(currentReservationNumber);
            reservationToBookingId.put(currentReservationId, bookingId);
            ++(currentReservationId);
            return true;
        }
    
}