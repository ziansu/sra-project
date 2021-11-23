@java.lang.Override
protected java.util.List<io.socket.testutils.FrameworkMethod> computeTestMethods() {
    java.util.List<io.socket.testutils.FrameworkMethod> methods = super.computeTestMethods();
    java.util.Collections.shuffle(methods);
    return methods;
}