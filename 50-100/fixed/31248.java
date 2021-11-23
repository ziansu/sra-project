@org.junit.Test
public void findTwoNodesForSumSolution2TwoNodesRightHasSumTest() {
    com.mounacheikhna.practice.datastructures.trees.Node root = new com.mounacheikhna.practice.datastructures.trees.Node(10);
    root.right = new com.mounacheikhna.practice.datastructures.trees.Node(12);
    java.util.List<com.mounacheikhna.practice.datastructures.trees.Node> result = sb.findTwoNodesForSumSol2(root, 22);
    org.junit.Assert.assertArrayEquals(new int[]{ 10 , 12 }, sb.getNodesValues(result));
}