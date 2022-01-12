private void nextStep(week4.Board b, week4.Board previous, edu.princeton.cs.algs4.MinPQ<week4.Solver.SearchNode> queue, int moves, boolean manhattan) {
    for (week4.Board n : b.neighbors()) {
        if (!(n.equals(previous))) {
            queue.insert(week4.Solver.SearchNode.create(b, (moves + 1), manhattan));
        }
    }
}