public Util.complex pow(int n) {
    double rn = (java.lang.Math.pow(getAbs(), n)) * (java.lang.Math.cos((n * (getAngle()))));
    double in = (java.lang.Math.pow(getAbs(), n)) * (java.lang.Math.sin((n * (getAngle()))));
    setR(rn);
    setI(in);
    return this;
}