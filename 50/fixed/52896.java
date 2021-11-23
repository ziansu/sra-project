public void buildClassifier(IF4071.DecisionTreeLearning.MyC45.Instances instances) throws java.lang.Exception {
    buildTree(instances, null);
    prune();
}