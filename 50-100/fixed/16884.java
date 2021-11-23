@java.lang.Override
public java.lang.Boolean equals(TestVector.Vector aVector) {
    if (aVector == null)
        throw new java.lang.NullPointerException();
    
    if ((aVector.getDimension()) == (dimension)) {
        for (int i = 0; i < (dimension); i++) {
            if ((location[i]) != (aVector.getLocation()[i]))
                return false;
            
        }
        return true;
    }
    return null;
}