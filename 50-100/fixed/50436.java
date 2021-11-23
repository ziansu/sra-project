public static void main(java.lang.String[] args) {
    reverse_nodes_in_k_group.ListNode test = reverse_nodes_in_k_group.ListNode.randomeNode(4, 100);
    reverse_nodes_in_k_group.ListNode.printlist(test);
    reverse_nodes_in_k_group.Solution sol = new reverse_nodes_in_k_group.Solution();
    edu.princeton.cs.algs4.StdOut.println("reverseKGroup");
    test = sol.reverseKGroup(test, 4);
    reverse_nodes_in_k_group.ListNode.printlist(test);
}