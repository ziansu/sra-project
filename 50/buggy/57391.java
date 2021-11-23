@java.lang.Override
public smile.classification.DecisionTree.Node call() {
    int[] falseCount = new int[k];
    return findBestSplit(n, count, falseCount, impurity, j);
}