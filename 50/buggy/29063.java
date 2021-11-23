public static void run() {
    MicroSearch.readInDocs();
    MicroSearch.processAndIndex();
    MicroSearch.keywordSearchOp();
    MicroSearch.nfile.ProcessStatsCall();
    java.util.Enumeration<java.lang.String> enumdf = BackData.wordFreqDoc.keys();
    MicroSearch.vectorSpace.runVectorSpaceModel();
}