public void printTree(java.lang.Integer depth) {
    java.lang.System.out.println("");
    for (int k = 0; k < depth; k++) {
        java.lang.System.out.print("-");
    }
    java.lang.System.out.print(fileName);
    for (java.lang.String fileName : children.keySet()) {
        children.get(fileName).printTree((depth + 1));
    }
}