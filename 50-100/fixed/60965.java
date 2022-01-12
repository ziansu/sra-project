public void judge() {
    int[] toCompare = GA.solution;
    fitness = 0;
    for (int i = 0; i < (geneLength); i++) {
        if ((genes[i]) == (toCompare[i]))
            (this.fitness)++;
        
    }
}