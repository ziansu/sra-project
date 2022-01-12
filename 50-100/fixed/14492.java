@org.junit.Test
public void testCase8() {
    me.chiwang.leetcode.ListNode l1 = me.chiwang.leetcode.ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8);
    l1 = solution.reverseKGroup(l1, 4);
    me.chiwang.leetcode.ListNode l2 = me.chiwang.leetcode.ListNodes.getListNodes(4, 3, 2, 1, 8, 7, 6, 5);
    assertListNodeEquals(l2, l1);
}