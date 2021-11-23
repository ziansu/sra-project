@org.junit.Before
public void setup() {
    testingData = setupTestingData(15, 10, 5);
    tree = new RandomForestHOG.DecisionTree.DecisionTree(testingData, 0);
}