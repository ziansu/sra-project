private static boolean isTaintStateValue(java.lang.String value) {
    assert (value != null) && (!(value.isEmpty()));
    com.h3xstream.findsecbugs.taintanalysis.Taint[] states = Taint.State.values();
    for (com.h3xstream.findsecbugs.taintanalysis.Taint.State state : states) {
        if (state.name().equals(value)) {
            return true;
        }
    }
    return false;
}