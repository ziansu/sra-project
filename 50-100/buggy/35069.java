public void printTree(java.lang.Integer depth) {
    java.util.Iterator<java.lang.String> i = children.keySet().iterator();
    if (i.hasNext()) {
        java.lang.String fileName = i.next();
        java.lang.System.out.println("");
        for (int k = 0; k < depth; k++) {
            java.lang.System.out.print("-");
        }
        java.lang.System.out.print(fileName);
        children.get(fileName).printTree((depth + 1));
    }
}