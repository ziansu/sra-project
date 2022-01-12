@org.junit.Test
public void testCreateAndArticleList() {
    articleController.createArticle("article");
    assertEquals("aricle", articleController.articleList().get(0).getReference());
}