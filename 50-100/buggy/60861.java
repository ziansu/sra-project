public util.collection.WeightedSet<Target> mapSourceToTarget(Source source, io.resources.WMISocket wmi, io.ontology.OntologySocket ontology, java.util.Collection<java.lang.Class<? extends knowledgeMiner.mapping.MappingHeuristic<Source, Target>>> disabledHeuristics) {
    util.collection.WeightedSet<Target> knownMapping = getAddCachedMapping(source, null);
    if (knownMapping != null)
        return knownMapping;
    
    util.collection.HierarchicalWeightedSet<Target> mappings = new util.collection.HierarchicalWeightedSet();
    mappings.setAll(mapSourceToTargetInternal(source, wmi, ontology, disabledHeuristics));
    if (disabledHeuristics == null)
        getAddCachedMapping(source, mappings);
    
    return mappings;
}