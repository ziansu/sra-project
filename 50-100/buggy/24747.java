protected void calcRankAndCrowding(com.msu.moo.model.solution.SolutionSet population) {
    rank = rankInd.calculate(population);
    crowding = new java.util.HashMap<>();
    for (com.msu.moo.model.solution.NonDominatedSolutionSet set : rankInd.getNonDominatedSets()) {
        crowdInd.calculate(crowding, set.getSolutions().normalize());
    }
}