public int compareTo(GeneticAlgorithm.FitnessAssessment other) {
    if ((other.average) < (average))
        return -1;
    
    if ((other.average) > (average))
        return 1;
    
    if ((other.lowest) < (lowest))
        return -1;
    
    if ((other.lowest) > (lowest))
        return 1;
    
    if ((other.highest) < (highest))
        return -1;
    
    if ((other.highest) > (highest))
        return 1;
    
    return 0;
}