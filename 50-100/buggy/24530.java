@java.lang.Override
public ch.ethz.idsc.tensor.Scalar minCostToGoal(ch.ethz.idsc.tensor.Tensor x) {
    ch.ethz.idsc.tensor.Tensor cur_xy = x.extract(0, 2);
    ch.ethz.idsc.tensor.Scalar cur_angle = x.Get(2);
    ch.ethz.idsc.tensor.Scalar dxy = Norm._2.of(cur_xy.subtract(xy)).subtract(radius);
    return ch.ethz.idsc.tensor.red.Max.of(dxy, RealScalar.ZERO);
}