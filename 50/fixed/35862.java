public org.openpixi.pixi.math.SU2GroupElement inv() {
    double n = computeParameterNorm();
    org.openpixi.pixi.math.SU2GroupElement v = ((org.openpixi.pixi.math.SU2GroupElement) (this.adj()));
    return ((org.openpixi.pixi.math.SU2GroupElement) (v.mult((1.0 / n))));
}