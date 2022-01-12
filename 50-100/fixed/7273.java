@java.lang.Override
public interfaces.Problem hcSteepestAscent(interfaces.Problem prob) {
    puzzle.PuzzleProblem current = ((puzzle.PuzzleProblem) (prob));
    puzzle.PuzzleState neighbor;
    while (true) {
        neighbor = ((puzzle.PuzzleState) (current.getBestNeighbor()));
        if ((neighbor.getValue()) >= (current.getState().getValue()))
            return current;
        
        current.addAction(neighbor.actstr);
        current.setState(neighbor);
    } 
}