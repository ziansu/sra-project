private java.lang.Class<?> getSuperClassOnSet(java.util.Set<java.lang.Class<?>> set, java.lang.Class<?> clazz) {
    java.lang.Class<?> found = null;
    for (java.lang.Class<?> aux : set) {
        if ((aux.isAssignableFrom(clazz)) && ((found == null) || (aux.isAssignableFrom(found)))) {
            found = aux;
        }
    }
    return found == null ? clazz : found;
}