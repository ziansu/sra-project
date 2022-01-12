@org.junit.Test
public void testCase10() {
    me.chiwang.leetcode.ListNode l1 = me.chiwang.leetcode.ListNodes.getListNodes(1, 2, 3, 4, 5, 6, 7, 8);
    l1 = solution.reverseKGroup(l1, 3);
    me.chiwang.leetcode.ListNode l2 = me.chiwang.leetcode.ListNodes.getListNodes(3, 2, 1, 6, 5, 4, 7, 8);
    assertListNodeEquals(l2, l1);
}