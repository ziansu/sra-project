private static boolean isTaintStateValue(java.lang.String value) {
    com.h3xstream.findsecbugs.taintanalysis.Taint[] states = Taint.State.values();
    for (com.h3xstream.findsecbugs.taintanalysis.Taint.State state : states) {
        if (state.name().equals(value)) {
            return true;
        }
    }
    return false;
}