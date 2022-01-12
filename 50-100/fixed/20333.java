@org.junit.Test
public void testFindByR_D() throws java.lang.Exception {
    com.liferay.portlet.journal.model.JournalArticle article = com.liferay.portlet.journal.service.persistence.JournalArticleFinderUtil.findByR_D(_article.getResourcePrimKey(), new java.util.Date());
    org.junit.Assert.assertNotNull(article);
    org.junit.Assert.assertEquals(_folder.getFolderId(), article.getFolderId());
}