@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/all")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<pet.shop.api.controller.model.PetControllerModel> retrieveAllPets() {
    final java.util.List<pet.shop.api.domain.Pet> petList = petShopApiService.retrieveAllPets();
    final java.util.List<pet.shop.api.controller.model.PetControllerModel> petControllerModelList = new java.util.ArrayList<>();
    for (final pet.shop.api.domain.Pet pet : petList) {
        final pet.shop.api.controller.model.PetControllerModel petControllerModel = petControllerMapper.mapTo(pet);
        petControllerModelList.add(petControllerModel);
    }
    return petControllerModelList;
}