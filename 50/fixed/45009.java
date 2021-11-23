@retrofit2.http.Headers(value = "Content-Type: application/x-www-form-urlencoded")
@retrofit2.http.FormUrlEncoded
@retrofit2.http.GET(value = "oauth2/v2.1/verify")
retrofit2.Call<com.linecorp.sample.login.infra.line.api.v2.response.Verify> verify(@retrofit2.http.Query(value = "access_token")
java.lang.String access_token);