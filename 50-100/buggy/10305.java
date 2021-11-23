@java.lang.Override
public boolean inferBound(wyopcl.translator.bound.Bounds bnd) {
    bnd.isChanged = false;
    max_x = bnd.getUpper(x);
    min_x = bnd.getLower(x);
    max_y = bnd.getUpper(y);
    min_y = bnd.getLower(y);
    if ((min_x) != (min_y)) {
        bnd.getDomain(x).setLowerBound(min_y);
    }
    if ((max_x) != (max_y)) {
        bnd.getDomain(x).setUpperBound(max_y);
    }
    return bnd.isChanged;
}