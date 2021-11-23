@org.junit.Test
public void findTwoNodesForSumSolution2TwoNodesLeftTest() {
    com.mounacheikhna.practice.datastructures.trees.Node root = new com.mounacheikhna.practice.datastructures.trees.Node(10);
    root.left = new com.mounacheikhna.practice.datastructures.trees.Node(2);
    java.util.List<com.mounacheikhna.practice.datastructures.trees.Node> result = sb.findTwoNodesForSumSol2(root, 11);
    java.lang.System.out.println(java.util.Arrays.toString(sb.getNodesValues(result)));
    org.junit.Assert.assertArrayEquals(new int[]{  }, sb.getNodesValues(result));
}