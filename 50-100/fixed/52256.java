@java.lang.Override
public void step() {
    (currentIteration)++;
    currentMinimumCost = currentSolution.getObjective(0);
    hero.core.problem.Solution<T> newSolution = newSolution();
    problem.evaluate(newSolution);
    if ((dominance.compare(newSolution, bestSolution)) < 0) {
        bestSolution = newSolution.clone();
    }
    if (((dominance.compare(newSolution, currentSolution)) < 0) || (changeState(newSolution))) {
        currentSolution = newSolution;
    }
}