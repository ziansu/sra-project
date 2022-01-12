@org.junit.Test
public void p4_5_check_BST_advanced() {
    int[] non_bst = new int[]{ 1 , 12 , 123 , 114 , 115 , 216 , 317 };
    assertEquals(false, p4_x.BSTUtil.checkBST(non_bst, 0, null, null));
}