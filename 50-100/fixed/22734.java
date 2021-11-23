public void calculatePositionY(double value, int offset, int plotSize, int posLabel, double min, double max) {
    double y;
    if (value >= max) {
        y = 0.99;
    }else {
        y = (value - min) / (max - min);
    }
    this.posY = ((int) ((y * plotSize) + offset));
}