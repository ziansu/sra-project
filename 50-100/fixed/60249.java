@org.junit.Test
public void shouldReturnNextNodeWhenLeftLeafIsGiven() {
    int[] values = new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 };
    cracking.answers.trees_graphs.ParentedBinaryTreeGenerator generator = new cracking.answers.trees_graphs.ParentedBinaryTreeGenerator();
    cracking.answer_key.trees_graphs.IntTreeNode node = generator.generateBinaryTree(values);
    java.lang.System.out.println(node.children[0].children[0]);
    cracking.answers.trees_graphs.Successor successor = new cracking.answers.trees_graphs.Successor();
    cracking.answer_key.trees_graphs.IntTreeNode result = successor.next(node.children[0].children[0]);
    junit.framework.TestCase.assertEquals(2, result.data);
}