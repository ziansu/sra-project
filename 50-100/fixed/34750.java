public static void main(java.lang.String[] args) {
    Algorithms.Instance i = new Algorithms.Instance(3, 3, 10, 5);
    DataStructures.BipartiteGraph graph = i.createInstance();
    Algorithms.GaleShapley algorithm = new Algorithms.GaleShapley(graph);
    i.testInstanceIntegration();
    algorithm.execute();
    algorithm.getMatch().printMatching();
}