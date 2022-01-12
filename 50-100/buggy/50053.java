public java.lang.Iterable<Board> solution() {
    if (!(isSolvable))
        return null;
    
    java.util.LinkedList<Board> ret = new java.util.LinkedList<>();
    while ((lastNode.preNode.board) != null) {
        ret.addFirst(lastNode.board);
        lastNode = lastNode.preNode;
    } 
    return ret;
}