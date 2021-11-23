public void propertyRemoved(T primitive, java.lang.String propertyName, java.lang.Object propertyValue) {
    getIndexInternal().remove(primitive, propertyName);
}