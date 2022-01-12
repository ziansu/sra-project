@java.lang.Override
public double value(burlap.mdp.core.state.State s) {
    return QFunction.QFunctionHelper.getOptimalValue(this, s);
}