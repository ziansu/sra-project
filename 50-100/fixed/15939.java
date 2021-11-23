public static void PrintNodeList(java.util.ArrayList<Node> list) {
    if (list == null) {
        return ;
    }
    for (int i = 0; i < (list.size()); i++) {
        java.lang.System.out.print(java.lang.String.format("%d ", list.get(i).data));
    }
}