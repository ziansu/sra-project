@java.lang.Override
public int compareTo(CinemaTicketBookingSystem.Presentation other) {
    if (((getDatetime()) == null) || ((other.getDatetime()) == null))
        throw new java.lang.NullPointerException();
    
    return getDatetime().compareTo(other.getDatetime());
}