@java.lang.Override
protected java.util.Map<Logic.Kernel.Graph.SymbolVertex, java.lang.String> computeObviousRConditions(java.util.Map<Logic.Kernel.Graph.SymbolVertex, java.lang.String> oneComponentConditionsMap) {
    java.util.Map<Logic.Kernel.Graph.SymbolVertex, java.lang.String> result = super.computeObviousRConditions(oneComponentConditionsMap);
    for (Logic.Kernel.Graph.SymbolVertex vertex : this.getComponentByM(1).getVertices()) {
        if (!((this.getP().equals(SymbolVertex.THREE)) && (vertex.getVertex().equals(SymbolVertex.THREE)))) {
            result.put(vertex, ASeries.CONDITION_R_1);
        }
    }
    return result;
}