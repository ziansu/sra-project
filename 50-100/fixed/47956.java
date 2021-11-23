public void printRegressionTreeNode(ml.Node node) {
    java.lang.System.out.println(("Feature Threshold Value: 	" + (node.getThresholdValue())));
    if ((node.getLeftChildNode()) != null) {
        java.lang.System.out.println("Left child node :");
        printRegressionTreeNode(node.getLeftChildNode());
        java.lang.System.out.println("Right child node :");
        printRegressionTreeNode(node.getRightChildNode());
    }
}