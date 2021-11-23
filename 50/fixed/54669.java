public nl.tudelft.model.Level getLevel(int id) throws java.lang.IllegalArgumentException {
    switch (id) {
        case 1 :
            return getLevel1();
        case 2 :
            return getLevel2();
        default :
            throw new java.lang.IllegalArgumentException();
    }
}