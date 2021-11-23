@org.junit.Test
public void testBuillArticle() throws java.lang.Exception {
    java.io.InputStream is = new java.io.FileInputStream(new java.io.File("C:\\ccgworkspace\\testfiles\\test1.pdf"));
    com.ccg.ingestion.extract.ExtractArticleInfoAuto extract = new com.ccg.ingestion.extract.ExtractArticleInfoAuto();
    com.ccg.ingestion.extract.ArticleInfo ainfo = extract.processArticle(is);
    for (com.ccg.ingestion.extract.Category c : ainfo.categoryList) {
        c.printMe(java.lang.System.out);
    }
}