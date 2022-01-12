public wr.leetcode.algo.ListNode swapPairs(wr.leetcode.algo.ListNode head) {
    wr.leetcode.algo.ListNode dest = new wr.leetcode.algo.ListNode((-1));
    wr.leetcode.algo.ListNode to = dest;
    wr.leetcode.algo.ListNode node = head;
    while (node != null) {
        wr.leetcode.algo.ListNode nextNode = node.next;
        if ((node.next) != null) {
            nextNode = node.next.next;
            to.next = node.next;
            to = to.next;
        }
        to.next = node;
        to = to.next;
        node = nextNode;
    } 
    return dest.next;
}