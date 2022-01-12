private double findDist(int myX, int myY, int tarX, int tarY) {
    double dist = (myX - tarY) * (myX - tarX);
    dist += (myY - tarY) * (myY - tarY);
    dist = java.lang.Math.sqrt(dist);
    return dist;
}