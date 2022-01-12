public int getNumOfNotCoveredGoals(org.evosuite.ga.FitnessFunction<?> ff) {
    return numsNotCoveredGoals.containsKey(ff) ? numsNotCoveredGoals.get(ff) : 0;
}