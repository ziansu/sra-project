private static boolean isFileFilterModule(java.lang.Class<?> loadedClass, java.lang.String className) {
    return ((com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter.class.isAssignableFrom(loadedClass)) && (com.puppycrawl.tools.checkstyle.api.AutomaticBean.class.isAssignableFrom(loadedClass))) && (className.endsWith("FileFilter"));
}