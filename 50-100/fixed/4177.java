private boolean moveFromA3BToC() {
    if ((A3B.empty()) || ((verticesToMove) < 1)) {
        return false;
    }
    verticesToMove -= swapper.changeColor(A3B.getVertices(), scheduling.three.C, verticesToMove);
    B3A.setForUpdate();
    C3B.setForUpdate();
    return true;
}