private java.util.List<java.lang.String> preProcessRules(hudson.model.AbstractBuild build, hudson.model.BuildListener listener) {
    java.lang.String[] paths = rules.split("\t|\n|\r|,");
    for (int i = 0; i < (paths.length); i++) {
        paths[i] = substituteVariable(build, listener, paths[i]);
    }
    return java.util.Arrays.asList(paths);
}