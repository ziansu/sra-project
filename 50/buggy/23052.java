public void setHitpoints() {
    this.hitpoints = (this.hitpoints) - 1;
    if ((getHitpoints()) == 0) {
        setSunk(true);
        IO.IO.println("Schiff wurde versenkt.");
    }
}