@java.lang.Override
public int compareTo(dw317.hotel.business.interfaces.Reservation reserve) {
    if (this.aRoom.equals(reserve.getRoom()))
        return checkIn.compareTo(reserve.getCheckInDate());
    
    return this.aRoom.compareTo(reserve.getRoom());
}