public boolean bookSeat(int seat, java.lang.String ticketID) {
    boolean success;
    if ((seats[seat]) != null) {
        seats[seat] = ticketID;
        success = true;
    }else {
        success = false;
    }
    return success;
}