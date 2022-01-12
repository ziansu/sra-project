public static void initEmptyDastList() {
    SimpleSetPerformanceAnalyzer.dastList = new SimpleSet[5];
    SimpleSetPerformanceAnalyzer.dastList[0] = new OpenHashSet();
    SimpleSetPerformanceAnalyzer.dastList[1] = new ChainedHashSet();
    SimpleSetPerformanceAnalyzer.dastList[2] = new CollectionFacadeSet(new java.util.TreeSet<java.lang.String>());
    SimpleSetPerformanceAnalyzer.dastList[3] = new CollectionFacadeSet(new java.util.LinkedList<java.lang.String>());
    SimpleSetPerformanceAnalyzer.dastList[4] = new CollectionFacadeSet(new java.util.HashSet<java.lang.String>());
}