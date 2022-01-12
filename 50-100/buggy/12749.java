public Util.complex pow(int n) {
    double rn = (java.lang.Math.pow(getAbs(), n)) * (java.lang.Math.cos(getAngle()));
    double in = (java.lang.Math.pow(getAbs(), n)) * (java.lang.Math.sin(getAngle()));
    setR(rn);
    setI(in);
    return this;
}