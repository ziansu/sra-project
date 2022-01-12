@java.lang.Override
public boolean overlap(dw317.hotel.business.interfaces.Reservation other) {
    if ((aRoom.getNumber()) == (other.getRoom().getNumber())) {
        if ((checkIn.isAfter(other.getCheckInDate())) && (checkOut.isBefore(other.getCheckInDate())))
            return false;
        
        if (checkIn.isAfter(other.getCheckOutDate()))
            return false;
        
    }
    return true;
}