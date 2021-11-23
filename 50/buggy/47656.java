@java.lang.Override
public double value(burlap.mdp.core.state.State s) {
    if ((this.tf) != null) {
        return QFunction.QFunctionHelper.getOptimalValue(this, s, this.tf);
    }else {
        return QFunction.QFunctionHelper.getOptimalValue(this, s);
    }
}