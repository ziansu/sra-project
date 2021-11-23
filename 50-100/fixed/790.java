private static net.isucon.bench.Scenario getRootInstance(java.lang.Class root, net.isucon.bench.Config config) {
    net.isucon.bench.Scenario sc = null;
    try {
        sc = ((net.isucon.bench.Scenario) (root.newInstance()));
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        java.lang.System.err.format("Failed to create instance of Scenario: %s%n", root);
        java.lang.System.err.format("Error %s: %s", e.getClass(), e.getMessage());
    }
    return sc;
}