@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean equals = true;
    entity.Tile other;
    if (!(obj instanceof entity.Tile))
        equals = false;
    else {
        other = ((entity.Tile) (obj));
        equals = ((this.toString().equals(other.toString())) && ((this.row) == (other.getRow()))) && ((this.col) == (other.getCol()));
    }
    return equals;
}