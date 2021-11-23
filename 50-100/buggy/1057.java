private com.h3xstream.findsecbugs.taintanalysis.Taint mergeTransferParameters(java.util.Collection<java.lang.Integer> transferParameters) {
    com.h3xstream.findsecbugs.taintanalysis.Taint taint = null;
    assert !(transferParameters.isEmpty());
    for (java.lang.Integer transferParameter : transferParameters) {
        try {
            com.h3xstream.findsecbugs.taintanalysis.Taint value = getFrame().getStackValue(transferParameter);
            taint = com.h3xstream.findsecbugs.taintanalysis.Taint.merge(taint, value);
        } catch (edu.umd.cs.findbugs.ba.DataflowAnalysisException ex) {
            throw new java.lang.RuntimeException("Bad transfer parameter specification", ex);
        }
    }
    assert taint != null;
    return taint;
}