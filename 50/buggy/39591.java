public void setPeriod(double period) {
    if (period > 100) {
        this.period = period;
    }else {
        this.period = 100;
    }
}