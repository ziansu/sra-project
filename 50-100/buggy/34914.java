@org.junit.Test
public void p4_5_check_BST_advanced() {
    int[] non_val = new int[]{ 1 , 12 , 123 , 114 , 115 , 216 , 317 };
    int[] non_bst = new int[]{ 3 , 1 , 5 , 0 , 2 , 4 , 6 };
    assertEquals(false, p4_x.BSTUtil.checkBST(non_bst, non_val, 0, null, null));
}