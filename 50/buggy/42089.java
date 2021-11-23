@io.swagger.client.api.FormUrlEncoded
@io.swagger.client.api.POST(value = "pet/{petId}")
retrofit2.Call<java.lang.Void> updatePetWithForm(@io.swagger.client.api.Path(value = "petId")
java.lang.Long petId, @io.swagger.client.api.Field(value = "name")
java.lang.String name, @io.swagger.client.api.Field(value = "status")
java.lang.String status);