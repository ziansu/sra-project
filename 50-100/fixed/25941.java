private void stats() throws java.lang.Exception {
    java.lang.String input = alignmentCommandOptions.statsAlignmentCommandOptions.input;
    java.lang.String output = alignmentCommandOptions.statsAlignmentCommandOptions.output;
    try {
        org.opencb.biodata.tools.alignment.BamManager alignmentManager = new org.opencb.biodata.tools.alignment.BamManager(java.nio.file.Paths.get(input));
        org.opencb.biodata.tools.alignment.stats.AlignmentGlobalStats stats = alignmentManager.stats();
        alignmentManager.close();
        java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File((output + "/stats.json")));
        writer.write(stats.toJSON());
        writer.close();
    } catch (java.lang.Exception e) {
        throw e;
    }
}