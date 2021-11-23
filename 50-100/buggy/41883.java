@java.lang.Override
public double probabilityOfTermination(burlap.oomdp.core.State s, java.lang.String[] params) {
    burlap.oomdp.core.State ms = this.map(s);
    if ((terminationStates.satisfies(ms)) || (policy.isDefinedFor(ms))) {
        return 1.0;
    }
    return 0.0;
}