public synchronized void reset() {
    java.lang.System.out.println("Called reset!");
    this.target = null;
    this.source = null;
    this.ship = null;
    this.x = -1;
    this.y = -1;
    this.direction = null;
    ended = false;
}