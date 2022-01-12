public boolean cancelSeats(int no) {
    if ((no > (this.booked)) && (no > 0)) {
        return false;
    }else {
        this.booked = -no;
        this.availability += no;
        this.setChanged();
        this.notifyObservers(this.availability);
        this.clearChanged();
        return true;
    }
}