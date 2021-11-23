public boolean hasCycle(Solution.ListNode head) {
    if ((head == null) || ((head.next) == null)) {
        return false;
    }
    Solution.ListNode slow = head;
    Solution.ListNode fast = head.next;
    while ((slow != null) && ((fast.next) != null)) {
        if (slow == fast) {
            return true;
        }
        if ((fast.next) == null) {
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
    } 
    return false;
}