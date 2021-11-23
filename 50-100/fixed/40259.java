private boolean isGridSquareTempInSameSquare(int mainX, int mainY, int mainParent, com.provinggrounds.sodukusolver.domain.GridSquare tempGS) {
    return ((tempGS.getParent()) == mainParent) && (((tempGS.getX()) != mainX) || ((tempGS.getY()) != mainY));
}