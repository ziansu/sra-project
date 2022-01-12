private static boolean IterationCriterion(integerProgramming.VectorBinomial spair, int V, int iter) {
    if (iter > 1) {
        int num = 0;
        for (int i = 0; i < V; i++) {
            if ((spair.vec.get(i)) != 0) {
                num++;
            }
            if (num <= iter) {
                return true;
            }
        }
    }
    return false;
}