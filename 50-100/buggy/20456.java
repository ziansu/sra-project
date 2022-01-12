private void addNeighboursToQueue(Solver.Node cur, edu.princeton.cs.algs4.MinPQ<Solver.Node> q, int m) {
    for (Board neighbour : cur.board.neighbors()) {
        if (((cur.preNode) != null) && ((cur.preNode.board) == neighbour))
            continue;
        
        Solver.Node newNode = new Solver.Node(neighbour, cur, m);
        q.insert(newNode);
    }
}