@retrofit2.http.Headers(value = "Content-Type: application/json")
@retrofit2.http.PUT(value = "player/{type}/state")
retrofit2.Call<java.lang.String> updateCharacterState(@retrofit2.http.Path(value = "type")
java.lang.String type, @retrofit2.http.Body
java.lang.String state);