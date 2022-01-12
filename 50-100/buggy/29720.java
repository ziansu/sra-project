public boolean setOffer(double price, double amount) {
    if ((this.lagerFuellung) >= amount) {
        org.oiltycoon.Tycoon.getTycoon().offerList.add(new org.oiltycoon.Offer(amount, price, this));
        this.lagerFuellung -= this.amount;
        return true;
    }else {
        return false;
    }
}