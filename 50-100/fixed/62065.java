public void generateReportsForTestResultsIn(net.thucydides.core.reports.html.TestOutcomes testOutcomes) throws java.io.IOException {
    net.thucydides.core.requirements.reports.RequirementsOutcomes requirementsOutcomes = requirementsFactory.buildRequirementsOutcomesFrom(testOutcomes.withRequirementsTags());
    copyResourcesToOutputDirectory();
    generateAggregateReportFor(testOutcomes);
    generateTagReportsFor(testOutcomes);
    generateTagTypeReportsFor(testOutcomes);
    for (java.lang.String name : testOutcomes.getTagNames()) {
        generateTagTypeReportsFor(testOutcomes.withTag(name), new net.thucydides.core.reports.html.ReportNameProvider(name));
    }
    generateRequirementTypeReports(requirementsOutcomes);
    generateResultReportsFor(testOutcomes);
    generateRequirementsReportsFor(requirementsOutcomes);
    generateReleasesReportFor(testOutcomes, requirementsOutcomes);
    copyTestResultsToOutputDirectory();
}