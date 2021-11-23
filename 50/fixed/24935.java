@retrofit2.http.GET(value = "good_deals/{id}")
io.reactivex.Observable<im.goody.android.data.dto.Deal> getDeal(@retrofit2.http.Header(value = "X-User-Token")
java.lang.String token, @retrofit2.http.Path(value = "id")
long id);