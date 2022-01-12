public boolean isPalindrome(leetcode.ListNode head) {
    leetcode.ListNode fast = head;
    leetcode.ListNode slow = head;
    while ((fast != null) && ((fast.next) != null)) {
        slow = slow.next;
        fast = fast.next.next;
    } 
    slow = reverse(slow);
    leetcode.ListNode iter = slow;
    while ((head != null) && (iter != null)) {
        if ((head.val) != (iter.val)) {
            return false;
        }
        head = head.next;
        iter = iter.next;
    } 
    return true;
}