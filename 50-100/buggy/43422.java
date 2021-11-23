private static java.lang.Runnable removeFileSystemRunnable(java.net.URI uri) {
    if ((com.google.common.jimfs.JimfsFileSystems.systemJimfsProvider) == null) {
        return com.google.common.jimfs.JimfsFileSystems.DO_NOTHING;
    }
    try {
        java.lang.reflect.Method method = com.google.common.jimfs.JimfsFileSystems.systemJimfsProvider.getClass().getDeclaredMethod("removeFileSystemRunnable", java.net.URI.class);
        return ((java.lang.Runnable) (method.invoke(com.google.common.jimfs.JimfsFileSystems.systemJimfsProvider, uri)));
    } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException | java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException("Unable to get Runnable for removing the FileSystem from the cache when it is closed", e);
    }
}