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
    return max;
}