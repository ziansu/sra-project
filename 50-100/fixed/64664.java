public boolean remove(java.lang.String guid, java.lang.String reservatinId) {
    java.util.ArrayList<hotelmanager.Reserve> userReservations = findAllUserReservations(guid);
    for (int x = 0; x < (userReservations.size()); x++) {
        if (userReservations.get(x).getReserveID().equals(reservatinId)) {
            list.remove(x);
            userReservations.remove(x);
            return true;
        }
    }
    return false;
}