@java.lang.Override
public void step() {
    (currentIteration)++;
    currentMinimumCost = currentSolution.getObjective(0);
    hero.core.problem.Solution<T> newSolution = newSolution();
    problem.evaluate(newSolution);
    boolean move = false;
    if ((dominance.compare(newSolution, currentSolution)) < 0) {
        move = true;
        bestSolution = newSolution.clone();
    }else
        if (changeState(newSolution)) {
            move = true;
        }
    
    if (move) {
        currentSolution = newSolution;
    }
}