private boolean checkAvailable(Room room, java.util.Calendar sDate, java.util.Calendar eDate) {
    java.util.Iterator<Reservation> iter = reservationIterator(sDate, eDate);
    while (iter.hasNext()) {
        Reservation reservation = iter.next();
        if ((reservation.getRoomNumber()) == (room.getRoomNumber()))
            return false;
        
    } 
    return true;
}