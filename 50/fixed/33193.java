@java.lang.Override
protected double getWeight(int rank) {
    return org.apache.commons.math3.util.FastMath.log((rank + 1));
}