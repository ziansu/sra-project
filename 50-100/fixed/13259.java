public double getCurrentProb(int x, int y) {
    double prob = 0.0;
    int start = ((x * (cols)) * 4) + (y * 4);
    for (int i = start; i < (start + 4); i++) {
        prob += fVect.get(i, 0);
    }
    return prob;
}