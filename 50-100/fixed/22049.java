public static void main(java.lang.String[] args) {
    isLinkedListPalidrome.Main m = new isLinkedListPalidrome.Main();
    isLinkedListPalidrome.Node node1 = new isLinkedListPalidrome.Node(1);
    isLinkedListPalidrome.Node node2 = new isLinkedListPalidrome.Node(1);
    isLinkedListPalidrome.Node node3 = new isLinkedListPalidrome.Node(2);
    isLinkedListPalidrome.Node node4 = new isLinkedListPalidrome.Node(1);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    java.lang.System.out.println(("Is the linkedList a palindrome is " + (m.isPalindrome(node1))));
}