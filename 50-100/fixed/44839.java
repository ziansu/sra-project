public static io.github.utplsql.api.reporter.Reporter createReporter(java.lang.String reporterName) {
    switch (reporterName.toUpperCase()) {
        case io.github.utplsql.api.CustomTypes.UT_DOCUMENTATION_REPORTER :
            return new io.github.utplsql.api.reporter.DocumentationReporter();
        case io.github.utplsql.api.CustomTypes.UT_COVERAGE_HTML_REPORTER :
            return new io.github.utplsql.api.reporter.CoverageHTMLReporter();
        case io.github.utplsql.api.CustomTypes.UT_TEAMCITY_REPORTER :
            return new io.github.utplsql.api.reporter.TeamCityReporter();
        case io.github.utplsql.api.CustomTypes.UT_XUNIT_REPORTER :
            return new io.github.utplsql.api.reporter.XUnitReporter();
        case io.github.utplsql.api.CustomTypes.UT_COVERALLS_REPORTER :
            return new io.github.utplsql.api.reporter.CoverallsReporter();
        case io.github.utplsql.api.CustomTypes.UT_COVERAGE_SONAR_REPORTER :
            return new io.github.utplsql.api.reporter.CoverageSonarReporter();
        case io.github.utplsql.api.CustomTypes.UT_SONAR_TEST_REPORTER :
            return new io.github.utplsql.api.reporter.SonarTestReporter();
        default :
            throw new java.lang.RuntimeException((("Reporter " + reporterName) + " not implemented."));
    }
}