@java.lang.Override
public double[] next() {
    update();
    return K.nextMultivariateNormal();
}