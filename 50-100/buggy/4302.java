public static TreeNode generateNode() {
    double randomKey = (TestClass.random.nextDouble()) * (TestClass.MAX_VALUE);
    double randomValue = (TestClass.random.nextDouble()) * (TestClass.MAX_VALUE);
    int randomIdentifier = TestClass.random.nextInt();
    TreeNode randomNode = new TreeNode(randomKey, randomValue, randomIdentifier);
    return randomNode;
}