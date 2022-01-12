private void removeRank(S solution) {
    boolean enc = false;
    int i = 0;
    while ((!enc) && (i < (this.rankedSubpopulations.size()))) {
        enc = this.rankedSubpopulations.get(i).contains(solution);
        if (enc) {
            this.rankedSubpopulations.get(i).remove(solution);
        }
        i++;
    } 
}