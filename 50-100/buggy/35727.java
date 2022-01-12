@org.junit.Before
public void setup() {
    testingData = Utils.Helper.setupTestingData(dataSize, numOfAttr, numOfClass);
    int numOfAttrSample = getNumOfAttrSample(testingData);
    if (0 > numOfAttrSample) {
        org.junit.Assert.fail();
    }else {
        tree = new RandomForestHOG.DecisionTree.DecisionTree(testingData, bootstrapRate, numOfAttrSample, 0);
    }
}