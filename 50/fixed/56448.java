@org.junit.Test
public void testInfoPrintingWorksWithMultipleReplacement() {
    java.lang.String systemOut = com.palantir.atlasdb.cli.runner.StandardStreamUtilities.wrapSystemOut(() -> com.palantir.atlasdb.cli.output.OutputPrinterTest.print.info("Replace {} of {} {}.", "all", "these", "fields"));
    org.assertj.core.api.Assertions.assertThat(systemOut).contains("Replace all of these fields. ");
}