@org.junit.Test
public void testCase6() {
    me.chiwang.leetcode.ListNode l1 = me.chiwang.leetcode.ListNodes.getListNodes(1, 2, 3, 4, 5);
    solution.reverseKGroup(l1, 6);
    me.chiwang.leetcode.ListNode l2 = me.chiwang.leetcode.ListNodes.getListNodes(1, 2, 3, 4, 5);
    assertListNodeEquals(l2, l1);
}