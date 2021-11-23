static boolean createReservation(int tlf, int showID, java.lang.String seats) {
    if (tlf > 0) {
        Reservation reservation = new Reservation(tlf, showID, Controller.splitSeatString(seats));
        if (MySqlConnection.createReservation(reservation)) {
            return true;
        }
    }
    return false;
}