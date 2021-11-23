@retrofit2.http.POST
rx.Observable<com.cidaassdk.LoginEntity> getAccessTokenByRefreshToken(@retrofit2.http.Url
java.lang.String url, @retrofit2.http.Header(value = "Content-Type")
java.lang.String content_type, @retrofit2.http.Query(value = "client_id")
java.lang.String client_id, @retrofit2.http.Query(value = "redirect_uri")
java.lang.String redirect_uri, @retrofit2.http.Query(value = "refresh_token")
java.lang.String refresh_token, @retrofit2.http.Query(value = "grant_type")
java.lang.String grant_type);