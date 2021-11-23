public boolean gameOver() {
    java.lang.System.out.println("Dodge - Game Over");
    for (Spike spike : spikes) {
        if ((spike != null) && (spike.intersects(bar))) {
            return true;
        }
    }
    return false;
}