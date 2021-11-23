@org.junit.Test
public void testBuillArticle() throws java.lang.Exception {
    java.io.InputStream is = new java.io.FileInputStream(new java.io.File("C:\\ccgworkspace\\testfiles\\test1.pdf"));
    com.ccg.ingestion.extract.ExtractArticleInfoAuto extract = new com.ccg.ingestion.extract.ExtractArticleInfoAuto();
    com.ccg.ingestion.extract.ArticleInfo ainfo = extract.processArticle(is);
    java.lang.String json = com.ccg.util.JsonHelper.toJson(ainfo.categoryList.toArray());
    java.lang.System.out.println(json);
    com.ccg.ingestion.extract.Category[] res = com.ccg.util.JsonHelper.fromJson(json, com.ccg.ingestion.extract.Category[].class);
    for (com.ccg.ingestion.extract.Category c : res) {
        c.printMe(java.lang.System.out);
    }
}