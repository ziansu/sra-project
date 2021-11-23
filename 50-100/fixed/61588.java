public bots.Island getMaxWeighted() {
    if ((islands.size()) == 0) {
        return null;
    }
    double max = weights.get(0);
    for (double w : weights) {
        if (w > max) {
            max = w;
        }
    }
    int maxIndex = weights.indexOf(max);
    return islands.get(maxIndex);
}