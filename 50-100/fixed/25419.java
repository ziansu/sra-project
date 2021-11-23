public void seatAllAvailable() {
    for (int r = 0; r < (MAX_ROW); r++) {
        for (int c = 0; c < (MAX_COLUMN); c++) {
            if ((seats[r][c]) == null) {
                com.navi.team.emptyseatnavigator.businessobject.Seat seat = new com.navi.team.emptyseatnavigator.businessobject.Seat(true);
                seat.setCol(c);
                seat.setRow(r);
                seats[r][c] = seat;
            }
        }
    }
}