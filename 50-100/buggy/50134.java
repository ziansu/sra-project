public static void main(java.lang.String[] args) {
    shafin.ml.tfidf.service.SearchService service = new shafin.ml.tfidf.service.SearchService();
    long init = new java.util.Date().getTime();
    java.util.List<shafin.ml.tfidf.dto.ArticleDto> docs = service.searchCollection("বাংলাদেশের কৃষি");
    long end = new java.util.Date().getTime();
    long diff = end - init;
    java.lang.System.out.println(("time taken: " + diff));
}