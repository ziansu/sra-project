private void prepareReadVcf() {
    htsjdk.tribble.AbstractFeatureReader<htsjdk.variant.variantcontext.VariantContext, htsjdk.tribble.readers.LineIterator> reader = htsjdk.tribble.AbstractFeatureReader.getFeatureReader(inputFile.getAbsolutePath(), new htsjdk.variant.vcf.VCFCodec(), false);
    header = ((htsjdk.variant.vcf.VCFHeader) (reader.getHeader()));
    if (!(header.hasFormatLine(probabilitiesField))) {
        java.lang.System.err.println("File does not seem to have genotype probabilities.");
        java.lang.System.exit(98);
    }
    progressLogger = new htsjdk.samtools.util.ProgressLogger(log, 10000);
}