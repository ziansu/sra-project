@java.lang.Override
public boolean equals(java.lang.Object that) {
    Location location = ((Location) (that));
    if ((((this.x) == (location.x)) && ((this.y) == (location.y))) && ((this.max) == (location.max))) {
        return true;
    }
    return false;
}