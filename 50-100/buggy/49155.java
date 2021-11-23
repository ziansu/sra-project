@org.junit.Test
public void findTwoNodesForSumSolution2TwoNodesRightTest() {
    com.mounacheikhna.practice.datastructures.trees.Node root = new com.mounacheikhna.practice.datastructures.trees.Node(10);
    root.right = new com.mounacheikhna.practice.datastructures.trees.Node(2);
    java.util.List<com.mounacheikhna.practice.datastructures.trees.Node> result = sb.findTwoNodesForSumSol2(root, 11);
    org.junit.Assert.assertArrayEquals(new int[]{  }, sb.getNodesValues(result));
    java.util.List<com.mounacheikhna.practice.datastructures.trees.Node> result2 = sb.findTwoNodesForSumSol2(root, 12);
    org.junit.Assert.assertArrayEquals(new int[]{ 10 , 2 }, sb.getNodesValues(result2));
}