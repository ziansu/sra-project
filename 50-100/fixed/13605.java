void doPlugins() {
    for (aQute.bnd.service.AnalyzerPlugin plugin : getPlugins(aQute.bnd.service.AnalyzerPlugin.class)) {
        try {
            boolean reanalyze;
            aQute.bnd.osgi.Processor previous = beginHandleErrors(plugin.toString());
            try {
                reanalyze = plugin.analyzeJar(this);
            } finally {
                endHandleErrors(previous);
            }
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