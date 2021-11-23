public net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder filter(net.bytebuddy.matcher.ElementMatcher<? super java.lang.ClassLoader> matcher) {
    java.util.List<java.lang.ClassLoader> classLoaders = new java.util.ArrayList<java.lang.ClassLoader>(this.classLoaders.size());
    for (java.lang.ClassLoader classLoader : this.classLoaders) {
        if (!(matcher.matches(classLoader))) {
            classLoaders.add(classLoader);
        }
    }
    return new net.bytebuddy.dynamic.loading.MultipleParentClassLoader.Builder(classLoaders);
}