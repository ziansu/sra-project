public boolean update(T entity) {
    try {
        setMyDao(getMyDao());
        getMyDao().update(entity);
        return true;
    } catch (java.lang.Exception db) {
        this.handleError((("The update operation in the class: " + (source.getClass().getCanonicalName())) + " was impossible for the given entity"));
        return false;
    }
}