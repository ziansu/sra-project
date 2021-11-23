private Jama.Matrix derivative() {
    Jama.Matrix err = thetaX().minus(y);
    Jama.Matrix der = x.transpose().times(err);
    der = der.times((((double) (1)) / (Constants.SIZE)));
    der.print(new java.text.DecimalFormat(Constants.NUMBER_FORMAT), 5);
    return der;
}