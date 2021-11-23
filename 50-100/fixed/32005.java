@java.lang.Override
public void run() throws de.charite.compbio.jannovar.JannovarException {
    java.lang.System.err.println("Options");
    java.lang.System.err.println(options.toString());
    java.lang.System.err.println("Loading database file...");
    deserializeTranscriptDefinitionFile(options.getDatabaseFilePath());
    java.lang.System.err.println("Loading FASTA index...");
    loadFASTAIndex();
    java.lang.System.err.println("Opening output VCF file...");
    try (htsjdk.variant.variantcontext.writer.VariantContextWriter writer = openOutputFile()) {
        processFile(writer);
    }
}