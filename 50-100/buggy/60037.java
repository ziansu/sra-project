private void populateClusterEmissions() {
    java.util.Map<java.lang.String, java.util.Set<conifer.models.CNSpecies>> cnSpeciesClusters = new java.util.LinkedHashMap<java.lang.String, java.util.Set<conifer.models.CNSpecies>>();
    for (conifer.models.CNSpecies s : cnSpecies) {
        java.lang.String cluster = s.getClusterID();
        java.util.Set<conifer.models.CNSpecies> clusterElements;
        if (cnSpeciesClusters.containsKey(cluster))
            clusterElements = cnSpeciesClusters.get(cluster);
        else
            clusterElements = new java.util.HashSet<conifer.models.CNSpecies>();
        
        clusterElements.add(s);
        cnSpeciesClusters.put(cluster, clusterElements);
    }
}