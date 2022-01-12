public static boolean isFileFilterModule(java.lang.Class<?> loadedClass) {
    return com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter.class.isAssignableFrom(loadedClass);
}