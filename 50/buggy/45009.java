@retrofit2.http.Headers(value = "Content-Type: application/x-www-form-urlencoded")
@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = "oauth2/v2.1/verify")
retrofit2.Call<com.linecorp.sample.login.infra.line.api.v2.response.Verify> verify(@retrofit2.http.Field(value = "access_token")
java.lang.String access_token, @retrofit2.http.Field(value = "client_id")
java.lang.String client_id, @retrofit2.http.Field(value = "client_secret")
java.lang.String client_secret);