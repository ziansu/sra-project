@java.lang.Override
public int compareTo(CinemaTicketBookingSystem.Presentation other) {
    if (((getDatetime()) == null) || ((other.getDatetime()) == null))
        return 0;
    
    return getDatetime().compareTo(other.getDatetime());
}