public java.util.Set<matjuice.analysis.MallocSite> commonMallocSites(matjuice.analysis.PointsToValue other) {
    java.util.Set<matjuice.analysis.MallocSite> commonMallocs = new java.util.HashSet<>();
    for (matjuice.analysis.MallocSite m : this.mallocs.keySet()) {
        if (other.mallocs.containsKey(m))
            commonMallocs.add(m);
        
    }
    return commonMallocs;
}