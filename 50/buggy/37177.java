@org.junit.Test
public void createAndPopulateStudyGitHub9June2015() throws java.io.IOException, java.net.URISyntaxException, org.eol.globi.data.NodeFactoryException, org.eol.globi.data.StudyImporterException {
    org.eol.globi.data.StudyImporterForGoMexSI importer = importWithCommit(org.eol.globi.service.GitHubUtil.getBaseUrl("gomexsi/interaction-data", "e51f18e016f26627d4c264797869c910f1baefdd"));
    assertInteractionCount(55150);
    org.eol.globi.data.StudyImporterForGoMexSIIT.assertThatSomeDataIsImported(importer, nodeFactory);
}