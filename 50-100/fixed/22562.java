private finalproject.VectorTermSpace getCentroid() {
    if ((cachedCentroid) != null)
        return cachedCentroid;
    
    finalproject.VectorTermSpace centroid = new finalproject.VectorTermSpace();
    for (finalproject.WeightedDocument d : members) {
        if (d != null)
            centroid = d.getVector().add(centroid);
        
    }
    centroid.divideBy(new java.lang.Double(members.size()));
    cachedCentroid = centroid;
    return centroid;
}