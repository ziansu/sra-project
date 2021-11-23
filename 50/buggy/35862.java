public org.openpixi.pixi.math.SU2GroupElement inv() {
    double n = computeParameterNorm();
    org.openpixi.pixi.math.SU2GroupElement v = ((org.openpixi.pixi.math.SU2GroupElement) (this.adj()));
    v.mult((1.0 / n));
    return v;
}