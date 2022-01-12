public <T> java.util.Collection<T> getAsCollection(java.lang.String name, java.lang.Class<T> clazz, java.util.Collection<T> defaultValue) {
    java.lang.Object object = this.get(null, name, java.lang.Object.class, defaultValue);
    if ((object != null) && (!(object instanceof java.util.List))) {
        throw new java.lang.ClassCastException(("Wrong type: " + (object.getClass())));
    }
    return net.parostroj.timetable.utils.ObjectsUtil.checkedCollection(((java.util.Collection<?>) (object)), clazz);
}