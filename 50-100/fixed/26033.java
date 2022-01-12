public static io.github.binglau.list.ListNode create(int[] data) {
    if ((data.length) == 0) {
        return null;
    }
    io.github.binglau.list.ListNode head = new io.github.binglau.list.ListNode(data[0]);
    if ((data.length) == 1) {
        return head;
    }
    for (int i = 1; i < (data.length); i++) {
        io.github.binglau.list.ListNode.add(head, data[i]);
    }
    return head;
}