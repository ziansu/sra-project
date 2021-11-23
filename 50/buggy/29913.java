public void evaluateTestSet(se.claremont.autotest.common.testset.TestSet testSet) {
    testSetJsonsList.add(testSet.toJson());
    testSetNames.add(testSet.name);
}