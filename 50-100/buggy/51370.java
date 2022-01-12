protected void internalTransform(java.lang.String phaseName, @java.lang.SuppressWarnings(value = "rawtypes")
java.util.Map options) {
    findClassLayoutMappings();
    for (java.lang.String className : entryPointClasses) {
        soot.SootClass sc = soot.Scene.v().getSootClass(className);
        java.util.List<soot.MethodOrMethodContext> methods = new java.util.ArrayList<soot.MethodOrMethodContext>();
        methods.addAll(sc.getMethods());
        analyzeRechableMethods(sc, methods);
        analyzeMethodOverrideCallbacks(sc);
    }
    java.lang.System.out.println("Callback analysis done.");
}