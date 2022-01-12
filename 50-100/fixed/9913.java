protected void writeResults() throws java.io.IOException {
    org.apache.commons.io.FileUtils.write(new java.io.File(outputFolder, de.unidue.ltl.flextag.core.reports.crf.TtAbstractKnownUnknownWordAccuracyReport.UNKNOWN_WORDS_FINE), java.lang.String.format("%.1f", ((outvocabAccuracy) * 100)));
    org.apache.commons.io.FileUtils.write(new java.io.File(outputFolder, de.unidue.ltl.flextag.core.reports.crf.TtAbstractKnownUnknownWordAccuracyReport.KNOWN_WORDS_FINE), java.lang.String.format("%.1f", ((invocabAccuracy) * 100)));
}