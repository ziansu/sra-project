@retrofit2.http.POST(value = "ghost/{id}/state")
retrofit2.Call<ca.sfu.pacmacro.API.model.Id> updateCharacterState(@retrofit2.http.Path(value = "id")
int id);