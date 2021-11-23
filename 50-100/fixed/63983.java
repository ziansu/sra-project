public void importData(java.lang.String repo) throws org.eol.globi.data.StudyImporterException {
    try {
        org.eol.globi.data.StudyImporter importer = new org.eol.globi.service.GitHubImporterFactory().createImporter(repo, parserFactory, nodeFactory);
        if (importer != null) {
            if ((getLogger()) != null) {
                importer.setLogger(getLogger());
            }
            importer.importStudy();
        }
    } catch (java.io.IOException | org.eol.globi.data.NodeFactoryException | java.net.URISyntaxException e) {
        throw new org.eol.globi.data.StudyImporterException((("failed to import repo [" + repo) + "]"), e);
    }
}