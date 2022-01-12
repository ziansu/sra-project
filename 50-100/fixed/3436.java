public void load(java.lang.String tExpFilePath) {
    it.unige.dibris.TExpRVMAS.utils.JPL.JPLInitializer.createAndCheck((("retractall(trace_expression(" + (protocolName)) + ", _))"));
    it.unige.dibris.TExpRVMAS.utils.JPL.JPLInitializer.createAndCheck("consult", new org.jpl7.Atom(tExpFilePath));
    if (!(isContractive())) {
        throw new it.unige.dibris.TExpRVMAS.exception.TraceExpressionNotContractiveException();
    }
    if (!((areEventsAtomic()) || (areEventsAsync()))) {
        throw new it.unige.dibris.TExpRVMAS.exception.TraceExpressionNeitherAtomicNorAsyncEventTypesException();
    }
}