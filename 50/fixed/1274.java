public static int getPostingListLength(net.semanticmetadata.lire.imageanalysis.features.GlobalFeature feature) {
    if (net.semanticmetadata.lire.indexers.hashing.MetricSpaces.supportsFeature(feature))
        return net.semanticmetadata.lire.indexers.hashing.MetricSpaces.parameters.get(feature.getClass().getName()).lengthOfPostingList;
    else
        return -1;
    
}