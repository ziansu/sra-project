private Node getNextMove() {
    Node n = fastestPath;
    if (n == null) {
        java.lang.System.out.println("no moves");
    }else
        if ((n.parent) == null) {
            java.lang.System.out.println("Only move");
            return n;
        }
    
    while ((n.parent.parent) != null) {
        java.lang.System.out.println(((n.toString()) + "->"));
        n = n.parent;
    } 
    java.lang.System.out.println();
}