private Jama.Matrix derivative() {
    Jama.Matrix err = thetaX().minus(y);
    Jama.Matrix der = x.transpose().times(err);
    der = der.times((((double) (1)) / (Constants.SIZE)));
    return der;
}