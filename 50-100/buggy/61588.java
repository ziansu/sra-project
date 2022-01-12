public bots.Island getMaxWeighted() {
    if ((islands.size()) == 0) {
        return null;
    }
    {
        if ((w) > (max)) {
            max = w;
        }
    }
    int maxIndex = weights.indexOf(max);
    return islands.get(maxIndex);
}