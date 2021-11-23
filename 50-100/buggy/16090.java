@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ADMIN')")
@org.springframework.web.bind.annotation.RequestMapping(value = { "/{group_id}" , "/{group_id}/" }, method = org.springframework.web.bind.annotation.RequestMethod.PUT, produces = "application/json", consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.String> update(@org.springframework.web.bind.annotation.RequestBody
java.lang.String json, @org.springframework.web.bind.annotation.PathVariable(value = "group_id")
java.lang.Long id) throws com.fasterxml.jackson.databind.JsonMappingException, java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    crac.models.db.entities.CracGroup updatedGroup = mapper.readValue(json, crac.models.db.entities.CracGroup.class);
    crac.models.db.entities.CracGroup oldGroup = groupDAO.findOne(id);
    oldGroup = updatedGroup;
    groupDAO.save(oldGroup);
    return crac.module.utility.JSONResponseHelper.successfullyUpdated(oldGroup);
}