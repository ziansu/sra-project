public void seatAllAvailable() {
    com.navi.team.emptyseatnavigator.businessobject.Seat seat = new com.navi.team.emptyseatnavigator.businessobject.Seat(true);
    for (int r = 0; r < (MAX_ROW); r++) {
        for (int c = 0; c < (MAX_COLUMN); c++) {
            if ((seats[r][c]) == null) {
                seat.setCol(c);
                seat.setRow(r);
                seats[r][c] = seat;
            }
        }
    }
}