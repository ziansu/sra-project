@org.junit.Test
public void testInfoPrintingWorksWithSingleReplacement() {
    java.lang.String systemOut = com.palantir.atlasdb.cli.runner.StandardStreamUtilities.wrapSystemOut(() -> com.palantir.atlasdb.cli.output.OutputPrinterTest.print.info("Test this gets {}", "replaced"));
    org.assertj.core.api.Assertions.assertThat(systemOut).contains("Test this gets replaced ");
}