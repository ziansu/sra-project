public java.util.Set<java.lang.Class> getClassesLoaded(java.lang.Class clazz) {
    return classesToTrackMap.get(clazz.getCanonicalName());
}