public java.util.List<java.lang.Integer> getValuesLCVOrder(cspSolver.Variable v) {
    cspSolver.HashMap<java.lang.Integer, java.lang.Integer> valuesToConstraints = new cspSolver.HashMap<java.lang.Integer, java.lang.Integer>();
    for (java.lang.Integer value : v.getDomain().getValues()) {
        int numConstraintsOnValue = getConstraintsOnVarWithValue(v, value);
        valuesToConstraints.put(value, numConstraintsOnValue);
    }
    getSortedKeys(valuesToConstraints);
    return getSortedKeys(valuesToConstraints);
}