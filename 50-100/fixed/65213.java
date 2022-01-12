private void seatAvailability() {
    outerloop : for (int i = 0; i < (ROWS); i++) {
        for (int j = 0; j < (COLUMNS); j++) {
            if ((userDesiredPrice) == (seatMap[i][j])) {
                isSeatAvailable = true;
                break outerloop;
            }else
                isSeatAvailable = false;
            
        }
    }
}