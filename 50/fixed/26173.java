@retrofit2.http.GET(value = "api/cards/{id}/position/{sessionid}")
retrofit2.Call<java.lang.Integer> getPositionInSession(@retrofit2.http.Path(value = "id")
int id, @retrofit2.http.Path(value = "sessionid")
int sessionId);