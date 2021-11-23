@retrofit2.http.Headers(value = { "Accept: application/json" })
@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = scs71.com.scscws.ui.utils.Constant.CREATE_WORK)
retrofit2.Call<java.lang.String> startWork(@retrofit2.http.Header(value = "API-TOKEN")
java.lang.String token, @retrofit2.http.Field(value = "cargo_work[port_code]")
java.lang.String portCode, @retrofit2.http.Field(value = "cargo_work[start_time]")
java.lang.String time);