public boolean setOffhandActive(boolean active) {
    boolean wasActive = offhandCast;
    this.offhandCast = active;
    return wasActive;
}