@retrofit2.http.FormUrlEncoded
@retrofit2.http.PATCH(value = "todos/{id}")
retrofit2.Call<hk.com.a4gtsstask.Note> updateNote(@retrofit2.http.Path(value = "id")
java.lang.String id, @retrofit2.http.Field(value = "title")
java.lang.String title);