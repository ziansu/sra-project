public void setAbleToPickup(boolean ableToPickup) {
    this.ableToPickup = ableToPickup;
    this.setChanged();
    this.notifyObservers();
}