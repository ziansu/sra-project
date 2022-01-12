public static void main(java.lang.String[] args) {
    java.io.File vcfFile = new java.io.File("trio.2010_06.ychr.sites.vcf.gz");
    htsjdk.samtools.util.IntervalList list = htsjdk.variant.vcf.VCFFileReader.fromVcf(vcfFile);
}