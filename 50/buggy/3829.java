@org.junit.Test
public void createAndPopulateStudyGitHubMostRecent() throws java.io.IOException, java.net.URISyntaxException, org.eol.globi.data.NodeFactoryException, org.eol.globi.data.StudyImporterException {
    java.lang.String baseUrlLastCommit = org.eol.globi.service.GitHubUtil.getBaseUrlLastCommit("gomexsi/interaction-data");
    org.eol.globi.data.StudyImporterForGoMexSI importer = importWithCommit(baseUrlLastCommit);
    assertInteractionCount(1234);
    org.eol.globi.data.StudyImporterForGoMexSIIT.assertThatSomeDataIsImported(importer, nodeFactory);
}