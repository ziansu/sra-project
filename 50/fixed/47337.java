@retrofit2.http.GET(value = "api/v1/merchants")
io.reactivex.Observable<com.oy.test.model.MerchantList> getMerchantByKeywordAndPage(@retrofit2.http.Query(value = "keywords")
java.lang.String keyword, @retrofit2.http.Query(value = "page")
int page);