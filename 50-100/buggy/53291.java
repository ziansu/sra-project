public void getState() {
    backend.analysis.dynamicsim.hierarchical.model.HierarchicalModel topmodel = getTopmodel();
    for (java.lang.String name : values.keySet()) {
        backend.analysis.dynamicsim.hierarchical.math.VariableNode node = topmodel.getNode(name);
        double value = node.getValue(topmodel.getIndex());
        if (value < 1.0E-9) {
            value = 0;
        }
        values.put(name, value);
    }
}