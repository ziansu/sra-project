static org.jenkinsci.plugins.workflow.cps.global.loader.GitLoader fromString(java.lang.String line) {
    java.lang.String[] splitted = line.split(" ");
    org.jenkinsci.plugins.workflow.cps.global.loader.GitLoader loader = new org.jenkinsci.plugins.workflow.cps.global.loader.GitLoader();
    loader.repositoryUrl = splitted[1];
    loader.branch = splitted[2];
    if ((splitted.length) > 2) {
        loader.clPath = splitted[3];
    }
    return loader;
}