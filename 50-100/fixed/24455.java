@java.lang.Override
public boolean equals(java.lang.Object obj) {
    team1.Coordinate pos = ((team1.Coordinate) (obj));
    if (((this.x) == (pos.getX())) && ((this.y) == (pos.getY()))) {
        return true;
    }else {
        return false;
    }
}