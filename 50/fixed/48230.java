public boolean gameOver() {
    for (Spike spike : spikes) {
        if ((spike != null) && (spike.intersects(bar))) {
            java.lang.System.out.println("Dodge - Game Over");
            return true;
        }
    }
    return false;
}