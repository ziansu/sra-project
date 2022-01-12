public static void main(java.lang.String[] args) {
    com.agenthun.leetcode.ListNode listNode = new com.agenthun.leetcode.ListNode(1);
    listNode.addListNode(2);
    listNode.addListNode(3);
    listNode.addListNode(3);
    listNode.addListNode(3);
    listNode.addListNode(4);
    listNode.addListNode(5);
    listNode.printListNode();
    com.agenthun.leetcode.ListNode result = new com.agenthun.leetcode.RemoveDuplicatesfromSortedListII().deleteDuplicates(listNode);
    result.printListNode();
}