@java.lang.Override
public edu.arizona.biosemantics.euler.alignment.server.taxoncomparison.state.State read(java.lang.String value) {
    value = value.trim();
    edu.arizona.biosemantics.euler.alignment.server.taxoncomparison.state.State state = null;
    for (edu.arizona.biosemantics.euler.alignment.server.taxoncomparison.state.StateReader reader : new edu.arizona.biosemantics.euler.alignment.server.taxoncomparison.state.StateReader[]{ modifiedStateReader , numericalRangeReader , discreteNumericalRangeReader , categoricalReader }) {
        state = reader.read(value);
        if (state != null) {
            break;
        }
    }
    return state;
}