public util.collection.WeightedSet<Target> mapSourceToTarget(Source source, io.resources.WMISocket wmi, io.ontology.OntologySocket ontology, java.util.Collection<java.lang.Class<? extends knowledgeMiner.mapping.MappingHeuristic<Source, Target>>> disabledHeuristics) {
    util.collection.HierarchicalWeightedSet<Target> mappings = new util.collection.HierarchicalWeightedSet();
    mappings.setAll(mapSourceToTargetInternal(source, wmi, ontology, disabledHeuristics));
    return mappings;
}