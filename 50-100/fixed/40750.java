java.lang.String tag(java.lang.StackTraceElement stackTraceElement) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    java.lang.String className = stackTraceElement.getClassName();
    java.lang.String[] packages = className.split("\\.");
    if (_package) {
        stringBuilder.append(className);
    }else {
        stringBuilder.append(packages[((packages.length) - 1)]);
    }
    return stringBuilder.toString();
}