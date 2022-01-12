public int distanceTo(bu.edu.cs664.Position pos) {
    int deltaX = (this.x) - (pos.x);
    int deltaY = (this.y) - (pos.y);
    return (java.lang.Math.abs(deltaX)) + (java.lang.Math.abs(deltaY));
}