private static void assignDeltaDistance(graph.clustering.kmeans.Category currentCategory) {
    double overallAverage = 0;
    for (int j = 0; j < (currentCategory.clusters.size()); j++) {
        currentCategory.clusters.get(j).averageEuclideanDistance = graph.clustering.kmeans.ClusterFactory.calculateAverageEuclideanDistance(currentCategory.clusters.get(j));
        overallAverage += currentCategory.clusters.get(j).averageEuclideanDistance;
    }
    currentCategory.overallAverageEuclideanDistance = overallAverage / (currentCategory.clusters.size());
}