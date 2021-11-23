private boolean isNotRefClazz(java.lang.String className) {
    if (defaultClasses.contains(className)) {
        return true;
    }
    if (className.contains("[")) {
        return true;
    }
    if (null != (self.getClass(className))) {
        return true;
    }
    return false;
}