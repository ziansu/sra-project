public void generateBottomEdge() {
    if (!(this.done)) {
        this.hue = 1.0F / 3.0F;
        this.cancelled = false;
        drawKochEdge(((1 - ((java.lang.Math.sqrt(3.0)) / 2.0)) / 2), 0.75, ((1 + ((java.lang.Math.sqrt(3.0)) / 2.0)) / 2), 0.75, this.level);
    }
}