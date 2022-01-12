private boolean checkAvailable(Room room, java.util.Calendar sDate) {
    java.util.Iterator<Reservation> iter = reservationIterator(sDate);
    while (iter.hasNext()) {
        Reservation reservation = iter.next();
        if ((reservation.getRoomNumber()) == (room.getRoomNumber()))
            return false;
        
    } 
    return true;
}