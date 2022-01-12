public void printList(tim.leetcode.List<java.lang.Integer> list) {
    if ((list.size()) == 0) {
        java.lang.System.out.println("[]");
        return ;
    }
    java.lang.System.out.print(("[" + (list.get(0))));
    for (int i = 1; i < (list.size()); ++i) {
        java.lang.System.out.print(("," + (list.get(i))));
    }
    java.lang.System.out.println("]");
}