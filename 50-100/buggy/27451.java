public void prepareInstances() {
    try {
        if (ib.isUsingCache())
            ib.validateCFDCache();
        
        edu.drexel.psal.jstylo.generics.Chunker.chunkAllTrainDocs(ib.getProblemSet());
        ib.extractEventsThreaded();
        ib.initializeRelevantEvents();
        ib.initializeAttributes();
        ib.createTrainingInstancesThreaded();
        ib.createTestInstancesThreaded();
        ib.killThreads();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Failed to prepare instances");
        e.printStackTrace();
    }
}