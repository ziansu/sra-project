@retrofit2.http.GET(value = "/svc/search/v2/articlesearch.json")
rx.Observable<com.codepath.nytimes.model.SearchResult> getFilteredArticle(@retrofit2.http.Query(value = "q")
java.lang.String query, @retrofit2.http.Query(value = "begin_date")
java.lang.String begin_date, @retrofit2.http.Query(value = "sort'")
java.lang.String sort, @retrofit2.http.Query(value = "fq")
java.lang.String category, @retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "api-key")
java.lang.String api_key);