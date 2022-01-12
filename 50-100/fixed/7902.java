protected static org.eclipse.dawnsci.analysis.api.fitting.functions.IParameter[] createParameters(int numberOfParameters) {
    org.eclipse.dawnsci.analysis.api.fitting.functions.IParameter[] params = new org.eclipse.dawnsci.analysis.api.fitting.functions.IParameter[numberOfParameters];
    for (int i = 0; i < numberOfParameters; i++) {
        params[i] = new uk.ac.diamond.scisoft.analysis.fitting.functions.Parameter();
    }
    return params;
}