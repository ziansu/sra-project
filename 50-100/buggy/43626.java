public int compare(com.ravi.GenericGA.GeneticAlgorithm.Individual m1, com.ravi.GenericGA.GeneticAlgorithm.Individual m2) {
    com.ravi.NSGA2.GeneticAlgorithm.Individuals.MultiObjectiveIndividual o1 = ((com.ravi.NSGA2.GeneticAlgorithm.Individuals.MultiObjectiveIndividual) (m1));
    com.ravi.NSGA2.GeneticAlgorithm.Individuals.MultiObjectiveIndividual o2 = ((com.ravi.NSGA2.GeneticAlgorithm.Individuals.MultiObjectiveIndividual) (m2));
    if ((o1.objectiveFitness()) == (o2.objectiveFitness()))
        return 0;
    
    return (o1.objectiveFitness()) > (o2.objectiveFitness()) ? -1 : 1;
}