@org.junit.BeforeClass
public static void createTree() {
    while ((spliterators.part4.exercise.NodeSpliteratorTest.numNodes) < 10) {
        spliterators.part4.exercise.NodeSpliteratorTest.numNodes = 0;
        spliterators.part4.exercise.NodeSpliteratorTest.root = spliterators.part4.exercise.NodeSpliteratorTest.createNodeRecursively("*");
    } 
}