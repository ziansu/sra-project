private static void fillMissingValues() {
    for (int i = 0; i < (DatasetCleanup.groupSize); i++) {
        for (int j = 0; j < (DatasetCleanup.labels.length); j++) {
            if ((DatasetCleanup.featureSpace[i][j].equals(null)) || (DatasetCleanup.featureSpace[i][j].equals("")))
                DatasetCleanup.featureSpace[i][j] = java.lang.String.valueOf((-1));
            
        }
    }
}