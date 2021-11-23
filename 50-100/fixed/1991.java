@org.junit.Test
public void testCase5() {
    me.chiwang.leetcode.ListNode l1 = me.chiwang.leetcode.ListNodes.getListNodes(1, 2, 3, 4, 5);
    l1 = solution.reverseKGroup(l1, 5);
    me.chiwang.leetcode.ListNode l2 = me.chiwang.leetcode.ListNodes.getListNodes(5, 4, 3, 2, 1);
    assertListNodeEquals(l2, l1);
}