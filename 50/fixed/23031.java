public void printTree() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    this.prettyPrint(stringBuilder);
    java.lang.System.out.print(stringBuilder);
    java.lang.System.out.println();
}