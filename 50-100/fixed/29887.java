public static void main(java.lang.String[] args) throws java.lang.Exception {
    edig.dig.representation.Neo4jHandler neo4jHandler = edig.dig.representation.Neo4jHandler.getInstance("/media/disk/master/Noe4j/UWCAN");
    edig.datasets.DatasetLoader datasetHandler = new edig.datasets.UWCANDataset("/media/disk/master/Master/datasets/WU-CAN/webdata");
    edig.clustering.algorithms.ModifiedSinglePass singlePassAlgorithm = new edig.clustering.algorithms.ModifiedSinglePass();
    java.util.Hashtable<java.lang.String, edig.dig.representation.Neo4jCluster> clusters = singlePassAlgorithm.perform(datasetHandler, neo4jHandler, 1, 5);
    java.lang.System.out.println(datasetHandler.numberOfDocuments());
    java.lang.System.out.println(clusters.size());
    neo4jHandler.registerShutdownHook();
}