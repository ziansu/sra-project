private static void checkDynamic(com.redhat.ceylon.compiler.typechecker.tree.Node that) {
    java.util.Set<java.lang.String> scopedBackends = that.getScope().getScopedBackends();
    if ((scopedBackends != null) && (scopedBackends.contains("jvm"))) {
        that.addUnsupportedError("dynamic is not supported on the JVM", Backend.Java);
    }
}