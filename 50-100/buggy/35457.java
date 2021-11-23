public boolean contains(geometry.Point P) {
    if (((P.x) < (tlc.x)) || ((P.x) > (brc.x))) {
        return false;
    }
    if (((P.y) < (tlc.y)) || ((P.y) > (tlc.y))) {
        return false;
    }
    return true;
}