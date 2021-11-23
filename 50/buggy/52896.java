public void buildClassifier(IF4071.DecisionTreeLearning.MyC45.Instances instances) throws java.lang.Exception {
    setData(instances);
    buildTree(data, null);
    prune();
}