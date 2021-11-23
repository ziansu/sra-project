public int getTotalBalance() {
    int totalBalance = 0;
    for (Reservation reservation : this.reservations) {
        if ((reservation.getRoomType()) == "L") {
            totalBalance = +200;
        }
        if ((reservation.getRoomType()) == "E") {
            totalBalance = +80;
        }
    }
    return totalBalance;
}