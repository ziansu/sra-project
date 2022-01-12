public boolean isSameType(entities.Movable m1, entities.Movable m2) {
    if (m2.isPowerDown)
        return false;
    
    if ((((m1 == null) || (m2 == null)) || ((m1.typeOne) == null)) || ((m2.typeOne) == null)) {
        return false;
    }
    return (((m1.typeOne) == (m2.typeOne)) && ((m1.typeTwo) == (m2.typeTwo))) || (m1.isPowerDown);
}