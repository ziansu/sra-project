public void MoveBackward(float distance) {
    Point newdir = new Point((-(direction.GetExX())), (-(direction.GetExY())), (-(direction.GetExZ())));
    for (Point p : frustum.points)
        Util.MovePointAlongVector(p, newdir, distance);
    
    Util.MovePointAlongVector(location, newdir, distance);
    Util.MovePointAlongVector(eye, newdir, distance);
}