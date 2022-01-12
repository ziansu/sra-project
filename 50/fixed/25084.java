public void doTraversal(java.lang.String start) {
    mark = new java.util.HashSet<java.lang.String>(((vertices.size()) + 1), 1.0F);
    dfTraverse(start, mark);
}