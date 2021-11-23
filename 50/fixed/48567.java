@org.junit.Test
public void testWarnPrintingWorksWithSingleReplacement() {
    java.lang.String systemOut = com.palantir.atlasdb.cli.runner.StandardStreamUtilities.wrapSystemErr(() -> com.palantir.atlasdb.cli.output.OutputPrinterTest.print.warn("Test this gets {}", "replaced"));
    org.assertj.core.api.Assertions.assertThat(systemOut).contains("Test this gets replaced ");
}