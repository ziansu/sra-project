void doPlugins() {
    for (aQute.bnd.service.AnalyzerPlugin plugin : getPlugins(aQute.bnd.service.AnalyzerPlugin.class)) {
        try {
            aQute.bnd.osgi.Processor previous = beginHandleErrors(plugin.toString());
            boolean reanalyze = plugin.analyzeJar(this);
            endHandleErrors(previous);
            if (reanalyze) {
                classspace.clear();
                analyzeBundleClasspath();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace(java.lang.System.err);
            error("Analyzer Plugin %s failed %s", plugin, e);
        }
    }
}