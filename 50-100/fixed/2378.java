public boolean bookSeats(int no) {
    if ((no > (this.availability)) && (no > 0)) {
        return false;
    }else {
        this.availability -= no;
        this.booked += no;
        this.setChanged();
        this.notifyObservers(this.availability);
        this.clearChanged();
        return true;
    }
}