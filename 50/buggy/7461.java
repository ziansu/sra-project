protected boolean existClass(java.lang.String classFullName) {
    try {
        java.lang.Class.forName(classFullName);
        return true;
    } catch (java.lang.ClassNotFoundException e) {
        return false;
    }
}