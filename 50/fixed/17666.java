public org.openpixi.pixi.math.AlgebraElement getEFromLinks(int index, int direction) {
    return getTemporalPlaquette(index, direction, 1).proj().mult(((-1.0) / (at)));
}