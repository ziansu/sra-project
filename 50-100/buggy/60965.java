public void judge() {
    int[] toCompare = GA.solution;
    for (int i = 0; i < (geneLength); i++) {
        if ((genes[i]) == (toCompare[i]))
            (this.fitness)++;
        
    }
}