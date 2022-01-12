@org.junit.Test
public void testDeleteNodeWithARightNodeThatHasALeftNode() {
    tree.delete(3);
    com.kohls.trinaryTree.TrinaryTreeNode node = tree.getRoot();
    org.junit.Assert.assertEquals(5, node.getValue());
    org.junit.Assert.assertEquals(6, node.getRightNode().getValue());
    org.junit.Assert.assertEquals(4, node.getRightNode().getLeftNode().getValue());
}