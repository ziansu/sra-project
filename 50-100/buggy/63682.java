public void reorderList(wr.leetcode.algo.ListNode head) {
    int len = len(head);
    int join = (len + 1) / 2;
    wr.leetcode.algo.ListNode node = head;
    for (int i = 1; i < join; ++i) {
        node = node.next;
    }
    wr.leetcode.algo.ListNode right = reverse(node.next);
    node.next = null;
    merge(head, right);
}