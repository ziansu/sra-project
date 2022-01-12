@java.lang.Override
protected void runFeature(final cucumber.runtime.model.CucumberFeature feature, final cucumber.runtime.arquillian.runner.BaseCukeSpace.CucumberRuntime cucumberRuntime, final cucumber.runtime.arquillian.testng.CukeSpace.FormaterReporterFacade reporter, final java.lang.Void runNotifier) throws java.lang.Throwable {
    reporter.reporter.startFeature();
    feature.run(reporter.formatter, reporter.reporter, cucumberRuntime);
    reporter.formatter.done();
    reporter.formatter.close();
    cucumberRuntime.printSummary();
    if (!(reporter.reporter.isPassed())) {
        throw new cucumber.runtime.CucumberException(reporter.reporter.getFirstError());
    }
}