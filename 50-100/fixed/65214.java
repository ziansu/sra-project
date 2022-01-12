public wr.leetcode.algo.ListNode getIntersectionNode(wr.leetcode.algo.ListNode headA, wr.leetcode.algo.ListNode headB) {
    int lenA = len(headA);
    int lenB = len(headB);
    if (lenA < lenB) {
        return getIntersectionNode(headB, headA);
    }
    int diff = lenA - lenB;
    while (null != headA) {
        if (diff > 0) {
            headA = headA.next;
            diff--;
        }else {
            if (headA == headB) {
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
    } 
    return headA;
}