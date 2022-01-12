java.lang.String tag(java.lang.StackTraceElement stackTraceElement) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    java.lang.String className = stackTraceElement.getClassName();
    java.lang.String[] packages = className.split("\\.");
    if (_package) {
        for (int i = 0; i < ((packages.length) - 2); i++) {
            stringBuilder.append(packages[i]);
        }
    }
    stringBuilder.append(packages[((packages.length) - 1)]);
    return stringBuilder.toString();
}