public java.awt.Point moveWalk(java.awt.Point p, int dir, int mag) {
    java.awt.Point point = move(p, dir, mag);
    if (isWall(point.x, point.y))
        return p;
    else
        return point;
    
}