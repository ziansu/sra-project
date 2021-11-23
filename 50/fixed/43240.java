@MPS.controllers.RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
MPS.models.Enterprises update(@MPS.controllers.PathVariable
long id, @MPS.controllers.RequestBody
MPS.models.Enterprises enterprise) {
    java.lang.System.out.println(id);
    java.lang.System.out.println(enterprise);
    enterprise.setId(id);
    enterprise.setModifiedDate();
    return enterpriserepo.save(enterprise);
}