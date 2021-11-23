@org.junit.Test
public void testErrorPrintingWorksWithMultipleReplacement() {
    java.lang.String systemErr = com.palantir.atlasdb.cli.runner.StandardStreamUtilities.wrapSystemErr(() -> com.palantir.atlasdb.cli.output.OutputPrinterTest.print.error("Replace {} of {} {}.", "all", "these", "fields"));
    org.assertj.core.api.Assertions.assertThat(systemErr).isEqualTo("Replace all of these fields. ");
}