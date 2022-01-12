public int getWidth() {
    if ((nestedBags) == null) {
        return (size) - 1;
    }
    int max = 0;
    for (tw.heuristic.Bag bag : nestedBags) {
        int w = bag.getWidth();
        if (w > max) {
            max = w;
        }
    }
    for (tw.heuristic.Separator separator : separators) {
        int w = separator.vertexSet.cardinality();
        if (w > max) {
            max = w;
        }
    }
    return max;
}