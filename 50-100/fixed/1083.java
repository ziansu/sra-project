public void calendar(int year, int month, int day) {
    if (!(paused)) {
        if (day >= (MallKing.daylength)) {
            (this.month)++;
            this.day = MallKing.daymod;
        }
        if (month > 12) {
            (this.year)++;
            this.month = 1;
        }
        if (!(paused)) {
            (this.day)++;
        }
    }
}