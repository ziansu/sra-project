public java.util.List<edu.cmu.ml.rtw.generic.structure.WeightedStructureSequence> getEdgePaths(int length) {
    java.util.List<edu.cmu.ml.rtw.generic.structure.WeightedStructureSequence> paths = new java.util.ArrayList<edu.cmu.ml.rtw.generic.structure.WeightedStructureSequence>();
    if (length <= 0)
        return paths;
    
    for (java.lang.String nodeId : this.edges.keySet())
        paths.addAll(getEdgePaths(nodeId, length, paths));
    
    return paths;
}