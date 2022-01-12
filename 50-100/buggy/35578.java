private static org.cbioportal.annotation.Options getOptions(java.lang.String[] args) {
    org.cbioportal.annotation.Options gnuOptions = new org.cbioportal.annotation.Options();
    gnuOptions.addOption("h", "help", false, "shows this help document and quits.").addOption("f", "filename", true, "Mutation filename").addOption("o", "outputFilename", true, "Output filename (including path)").addOption("i", "isoformOverride", true, "Isoform Overrides (mskcc or uniprot)").addOption("r", "replace-symbol", true, "Replace gene symbols with what is provided by annotator");
    return gnuOptions;
}