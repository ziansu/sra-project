@org.junit.Test
public void testFindByR_D() throws java.lang.Exception {
    java.util.Calendar calendar = new java.util.GregorianCalendar();
    calendar.add(java.util.Calendar.DATE, (-2));
    com.liferay.portlet.journal.model.JournalArticle article = com.liferay.portlet.journal.service.persistence.JournalArticleFinderUtil.findByR_D(_article.getResourcePrimKey(), new java.util.Date());
    org.junit.Assert.assertNotNull(article);
    org.junit.Assert.assertEquals(_folder.getFolderId(), article.getFolderId());
}