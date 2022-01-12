public static void removeDuplicates(ctci.ch02.LinkedLists.Node head) {
    java.util.HashSet<java.lang.Integer> set = new java.util.HashSet<>();
    ctci.ch02.LinkedLists.Node prev = null;
    ctci.ch02.LinkedLists.Node n = head;
    while (n != null) {
        if (set.contains(n.data)) {
            prev.next = n.next;
        }else {
            set.add(n.data);
            prev = n;
        }
        n = n.next;
    } 
}