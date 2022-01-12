public int compareTo(GeneticAlgorithm.FitnessAssessment other) {
    if ((average) < (other.average))
        return -1;
    
    if ((average) > (other.average))
        return 1;
    
    if ((lowest) < (other.lowest))
        return -1;
    
    if ((lowest) > (other.lowest))
        return 1;
    
    if ((highest) < (other.highest))
        return -1;
    
    if ((highest) > (other.highest))
        return 1;
    
    return 0;
}