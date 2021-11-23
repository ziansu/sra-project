private void removeRank(S solution) {
    boolean enc = false;
    int i = 0;
    while (i < (this.rankedSubpopulations.size())) {
        while (this.rankedSubpopulations.get(i).contains(solution)) {
            this.rankedSubpopulations.get(i).remove(solution);
        } 
        i++;
    } 
}