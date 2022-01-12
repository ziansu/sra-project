private static java.util.Collection<hudson.FilePath> getRakeSpecifications(hudson.FilePath specifications) throws java.io.IOException, java.lang.InterruptedException {
    java.util.Collection<hudson.FilePath> rakeSpecs = new java.util.LinkedHashSet<hudson.FilePath>();
    hudson.FilePath specs = specifications.list(hudson.plugins.rake.RvmUtil.rakeFilter);
    if (specs != null) {
        rakeSpecs.addAll(specs);
    }
    for (hudson.FilePath subDirectory : specifications.listDirectories()) {
        specs = subDirectory.list(hudson.plugins.rake.RvmUtil.rakeFilter);
        if (specs != null) {
            rakeSpecs.addAll(specs);
        }
    }
    return rakeSpecs;
}