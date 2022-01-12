public boolean isArc(int v1, int v2) {
    if (toBoolean(mGraph.get(((v1 * (mSize)) + v2)))) {
        return true;
    }else {
        return false;
    }
}