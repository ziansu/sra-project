public org.graphwalker.java.test.Result execute() {
    java.lang.ClassLoader contextClassLoader = switchClassLoader(classLoader);
    org.graphwalker.java.test.Result result = createResult(org.graphwalker.java.test.Reflections.invoke(executor, execute));
    switchClassLoader(contextClassLoader);
    return result;
}