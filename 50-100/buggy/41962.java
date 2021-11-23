public static void removeInferredAtomic(org.neo4j.graphdb.GraphDatabaseService db, java.util.Map<java.lang.String, java.lang.String> params) throws java.io.IOException {
    java.lang.String label;
    try {
        label = params.get(HistographTokens.RelationTokens.LABEL);
    } catch (org.json.JSONException e) {
        throw new java.io.IOException("Relation label missing.");
    }
    java.lang.String[] atomicLabels = org.waag.histograph.reasoner.ReasoningDefinitions.getAtomicRelationsFromLabel(label);
    if (atomicLabels == null) {
        java.lang.System.out.println(("No atomic relations associated with label " + label));
        return ;
    }else {
        org.waag.histograph.reasoner.AtomicInferencer.removeInferredAtomicRelations(db, params, atomicLabels);
    }
}