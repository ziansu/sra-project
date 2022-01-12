public boolean addArc(int v1, int v2, java.lang.Integer weight) {
    if (!(isArc(v1, v2))) {
        return false;
    }
    mGraph.add(((v1 * (mSize)) + v2), weight);
    return true;
}