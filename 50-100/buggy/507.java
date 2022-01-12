@java.lang.Override
public ch.ethz.idsc.tensor.Scalar costIncrement(ch.ethz.idsc.owly.math.state.StateTime from, java.util.List<ch.ethz.idsc.owly.math.state.StateTime> trajectory, ch.ethz.idsc.owly.math.flow.Flow flow) {
    ch.ethz.idsc.tensor.Scalar sum = ch.ethz.idsc.tensor.RealScalar.of(0);
    for (int i = 0; i < (flow.getU().length()); i++) {
        sum = sum.add(Norm._2.of(flow.getU()).add(ch.ethz.idsc.tensor.RealScalar.of(0.1)));
    }
    return sum.multiply(ch.ethz.idsc.owly.math.state.Trajectories.timeIncrement(from, trajectory));
}