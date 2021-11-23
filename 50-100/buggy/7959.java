private void _undoRemoveInconsistentValues(java.util.Map<solver.csp.Variable, java.util.List<java.lang.Integer>> map) {
    for (java.util.Map.Entry<solver.csp.Variable, java.util.List<java.lang.Integer>> neighbor : map.entrySet()) {
        for (java.lang.Integer value : neighbor.getValue()) {
            neighbor.getKey().addLegalValue(value);
        }
    }
}