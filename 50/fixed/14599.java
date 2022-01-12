public static final boolean isClassExists(java.lang.String className) {
    try {
        java.lang.Class.forName(className);
        return true;
    } catch (java.lang.ClassNotFoundException cnfe) {
        return false;
    }
}