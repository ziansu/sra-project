public void addData(double eval, int newDepth, boolean isScore) {
    if (isScore) {
        (visits)++;
        sum_utility += eval;
        sum_sq += eval * eval;
        depth = java.lang.Math.max(depth, newDepth);
    }else
        (heuristicVisits)++;
    
}