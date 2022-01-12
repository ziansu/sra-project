public void calculatePositionY(double value, int offSet, int plotSize, int posLabel, double min, double max) {
    double aux;
    if (value == max) {
        aux = 0.99;
    }else {
        aux = (value - min) / (max - min);
    }
    posLabel = posLabel + 1;
    this.posY = ((int) (((aux * plotSize) * posLabel) + offSet));
}