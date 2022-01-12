public java.lang.Iterable<Board> solution() {
    if ((solution) == null)
        return null;
    
    edu.princeton.cs.algs4.Stack<Board> trace = new edu.princeton.cs.algs4.Stack<Board>();
    Solver.SearchNode current = solution;
    while (current != null) {
        trace.push(current.board);
        current = current.parent;
    } 
    return trace;
}