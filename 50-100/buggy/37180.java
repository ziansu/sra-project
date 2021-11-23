public void calculatePathLength(fifteen.graphs.PuzzleNode node) {
    int length = 0;
    while (node != null) {
        length++;
        java.lang.System.out.println(node.toString());
        moves += node.getMoves();
        node = node.getParent();
    } 
    moves = new java.lang.StringBuffer(moves).reverse().toString();
    this.solutionLength = length;
}