@org.junit.Test
public void getVocabularyNamespacesTest() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyFolder vocabulary = vocabularyService.getVocabularyFolder(1);
    java.util.List<eionet.meta.dao.domain.VocabularyFolder> vocabularyFolders = new java.util.ArrayList<eionet.meta.dao.domain.VocabularyFolder>();
    vocabularyFolders.add(vocabulary);
    java.util.List<eionet.meta.dao.domain.RdfNamespace> nss = vocabularyService.getVocabularyNamespaces(vocabularyFolders);
    org.junit.Assert.assertEquals(nss.size(), 2);
}