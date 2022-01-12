public synchronized void generateRightEdge() {
    if (!(this.done)) {
        hue = 2.0F / 3.0F;
        cancelled = false;
        drawKochEdge(((1 + ((java.lang.Math.sqrt(3.0)) / 2.0)) / 2), 0.75, 0.5, 0.0, level);
    }
}