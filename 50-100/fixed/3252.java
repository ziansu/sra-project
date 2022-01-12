protected java.lang.Class<?> loadAgain(java.lang.String s) throws java.lang.ClassNotFoundException {
    java.lang.Class<?> clazz = null;
    if (classExist(s, this.classpath.toArray(new java.lang.String[this.classpath.size()]))) {
        clazz = findClass(s);
    }else {
        clazz = loadClassAsReloadable(s);
    }
    return clazz;
}