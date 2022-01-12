@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof adventofcode.SantaDeliveries.Coord)) {
        return false;
    }
    adventofcode.SantaDeliveries.Coord other = ((adventofcode.SantaDeliveries.Coord) (obj));
    if ((x) != (other.x)) {
        return false;
    }
    if ((y) != (other.y)) {
        return false;
    }
    return true;
}