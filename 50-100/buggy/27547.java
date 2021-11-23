public static java.util.Set<java.net.URL> getUserClasspath() {
    java.util.Set<java.net.URL> classpath = new java.util.TreeSet<java.net.URL>(new com.net2plan.internal.SystemUtils.URLComparator());
    classpath.addAll(com.net2plan.internal.SystemUtils.getClasspath());
    classpath.removeAll(com.net2plan.internal.SystemUtils.defaultClasspath);
    return java.util.Collections.unmodifiableSet(classpath);
}