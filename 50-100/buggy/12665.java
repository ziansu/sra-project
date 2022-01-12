@org.springframework.web.bind.annotation.PostMapping(value = "/byName/{userId}")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public com.softserve.if072.common.model.Store getStoreByNameAndUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer userId, @org.springframework.web.bind.annotation.RequestBody
com.softserve.if072.common.model.Store store) {
    com.softserve.if072.common.model.Store oldStore = storeService.getStoreByNameAndUser(store.getName(), store.getAddress(), userId);
    com.softserve.if072.restservice.controller.StoreController.LOGGER.info(java.lang.String.format("Store with name %s was retrieved", store.getName()));
    if (oldStore != null) {
        return oldStore;
    }else
        return null;
    
}