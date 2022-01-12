@java.lang.Override
public boolean overlap(dw317.hotel.business.interfaces.Reservation other) {
    if (this.equals(other))
        return true;
    
    if ((this.checkIn.isBefore(other.getCheckOutDate())) && (this.checkOut.isBefore(other.getCheckInDate())))
        return true;
    
    return false;
}