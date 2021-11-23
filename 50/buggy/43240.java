@MPS.controllers.RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
MPS.models.Enterprises update(@MPS.controllers.PathVariable
long id, @MPS.controllers.RequestBody
MPS.models.Enterprises enterprise) {
    enterprise.setId(id);
    enterprise.setModifiedDate();
    return enterpriserepo.save(enterprise);
}