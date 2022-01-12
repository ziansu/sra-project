public static void main(java.lang.String[] args) {
    odd_even_linked_list.ListNode test = odd_even_linked_list.ListNode.randomeNode(0, 100);
    edu.princeton.cs.algs4.StdOut.println(test);
    odd_even_linked_list.Solution sol = new odd_even_linked_list.Solution();
    test = sol.oddEvenList(test);
    edu.princeton.cs.algs4.StdOut.println(test);
}