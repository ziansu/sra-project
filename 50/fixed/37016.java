@com.gcm.younghyup.gcm.RestRequest.FormUrlEncoded
@com.gcm.younghyup.gcm.RestRequest.PUT(value = "/api/user/gcm/{devicetype}")
retrofit.Call<com.gcm.younghyup.gcm.RestRequest.Item> sendID(@com.gcm.younghyup.gcm.RestRequest.Field(value = "id")
java.lang.String id, @com.gcm.younghyup.gcm.RestRequest.Path(value = "devicetype")
java.lang.String type);