private java.util.List<edu.clemson.resolve.AnnotatedModule> parseAndReturnRootModules() {
    java.util.List<edu.clemson.resolve.AnnotatedModule> modules = new java.util.ArrayList<>();
    for (java.lang.String e : targetFiles) {
        edu.clemson.resolve.AnnotatedModule m = parseModule(e);
        if (m != null) {
            modules.add(m);
        }
    }
    return modules;
}