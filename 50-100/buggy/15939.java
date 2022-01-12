public static void PrintNodeList(java.util.ArrayList<Node> list) {
    for (int i = 0; i < (list.size()); i++) {
        java.lang.System.out.print(java.lang.String.format("%d ", list.get(i).data));
    }
}