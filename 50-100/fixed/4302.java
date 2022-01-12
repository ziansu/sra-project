public static TreeNode generateNode() {
    double randomKey = (TestClass.random.nextDouble()) * (TestClass.MAX_VALUE);
    double randomValue = (TestClass.random.nextDouble()) * (TestClass.MAX_VALUE);
    int randomIdentifier = (TestClass.random.nextInt()) % (TestClass.MAX_VALUE);
    TreeNode randomNode = new TreeNode(randomKey, randomValue, randomIdentifier);
    return randomNode;
}