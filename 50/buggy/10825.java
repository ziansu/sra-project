@retrofit2.http.PUT(value = "/chore/{id}/deny")
retrofit2.Call<com.theironyard.finalproject.representations.Chore> denyChore(@retrofit2.http.Header(value = com.theironyard.finalproject.services.ParentChoreService.TOKEN_KEY)
java.lang.String token, @retrofit2.http.Path(value = "id")
int id);