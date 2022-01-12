@org.junit.Test
public void test() {
    int[] arr = new int[]{ 6 , 5 , 7 , 10 , 9 , 8 };
    int[] level = new int[]{ 4 , 2 , 7 , 1 , 3 , 6 , 9 , 5 , 8 , 10 };
    org.caiguoqing.skye.algorithm.tree.AVLTree avl = org.caiguoqing.skye.algorithm.tree.AVLTree.build(arr);
    org.junit.Assert.assertArrayEquals("AVL Tree add invalid", level, avl.levelLoop());
}