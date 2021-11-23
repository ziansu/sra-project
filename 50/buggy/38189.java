protected java.lang.ClassLoader getClassLoader(java.lang.Class<?> stageClass) {
    return java.lang.Thread.currentThread().getContextClassLoader();
}