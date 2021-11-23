@java.lang.Override
public void addTraces(java.util.List<de.uni.freiburg.iig.telematik.sewol.log.LogTrace<E>> traces) throws de.invation.code.toval.validate.ParameterException {
    de.invation.code.toval.validate.Validate.notNull(traces);
    for (de.uni.freiburg.iig.telematik.sewol.log.LogTrace<E> trace : traces) {
        addTrace(trace);
    }
}