private static java.lang.String classNameToJavaFileName(java.lang.String className) {
    className = className.replace(KoanConstants.PERIOD, DirectoryManager.FILESYSTEM_SEPARATOR);
    if (className.contains(com.sandwich.util.io.FileUtils.DOLLAR_SIGN)) {
        className = className.substring(0, className.indexOf(com.sandwich.util.io.FileUtils.DOLLAR_SIGN));
    }
    return className + (FileCompiler.JAVA_SUFFIX);
}