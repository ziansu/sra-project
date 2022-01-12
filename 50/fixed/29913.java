public void evaluateTestSet(se.claremont.autotest.common.testset.TestSet testSet) {
    testSetNames.add(testSet.name);
    testSetJsonsList.add(testSet.toJson());
}