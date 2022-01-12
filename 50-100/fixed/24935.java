public boolean update(T entity) {
    try {
        setMyDao(getMyDao());
        if ((getMyDao().update(entity)) == 1)
            return true;
        
        return false;
    } catch (java.lang.Exception db) {
        this.handleError((("The update operation in the class: " + (source.getClass().getCanonicalName())) + " was impossible for the given entity"));
        return false;
    }
}