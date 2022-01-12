private void DisplayProgram() {
    com.Tool.println("== Program ==");
    for (int i = 0; i < (T.getDAGNumber()); i++) {
        int number = i + 1;
        com.Tool.print((("Group #" + number) + ":\n"));
        TraverseDAG(T.getDAGAt(i));
    }
}