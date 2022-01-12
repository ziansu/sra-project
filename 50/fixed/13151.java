@retrofit2.http.Multipart
@retrofit2.http.POST(value = "/api/pay")
retrofit2.Call<okhttp3.ResponseBody> payment(@retrofit2.http.Header(value = "Authorization")
java.lang.String AuthValue, @retrofit2.http.Part(value = "projectId")
java.lang.Integer projectId, @retrofit2.http.Part(value = "amount")
java.lang.Float amount);