public static org.gbif.utils.file.tabular.TabularDataFileReader<java.util.List<java.lang.String>> newTabularFileReader(java.io.InputStream in, char quoteChar, char delimiterChar, java.lang.String endOfLineSymbols, java.nio.charset.Charset charset, boolean headerLine) {
    com.google.common.base.Preconditions.checkNotNull(in, "An InputStream must be provided");
    com.google.common.base.Preconditions.checkNotNull(charset, "A Charset must be provided");
    return new org.gbif.utils.file.tabular.SuperCsvFileReader(in, quoteChar, delimiterChar, endOfLineSymbols, charset, headerLine);
}