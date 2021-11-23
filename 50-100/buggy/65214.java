public wr.leetcode.algo.ListNode getIntersectionNode(wr.leetcode.algo.ListNode headA, wr.leetcode.algo.ListNode headB) {
    int lenA = len(headA);
    int lenB = len(headB);
    if (lenA < lenB) {
        return getIntersectionNode(headB, headA);
    }
    int diff = lenA - lenB;
    while (null != headA) {
        headA = headA.next;
        if (diff > 0) {
            diff--;
        }else {
            headB = headB.next;
        }
        if (headA == headB) {
            break;
        }
    } 
    return headA;
}