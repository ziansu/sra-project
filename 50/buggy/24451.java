@com.hserv.coordinatedentry.housinginventory.annotation.APIMapping(value = "DELETE_ASSIGNMENT_BY_ID")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{housingUnitId}/assignments/{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<java.lang.Void> deleteHousingUnitAddress(@org.springframework.web.bind.annotation.PathVariable
java.util.UUID housingUnitId, @org.springframework.web.bind.annotation.PathVariable
java.util.UUID id) {
    housingUnitAssignmentService.delete(id);
    return org.springframework.http.ResponseEntity.ok().headers(com.hserv.coordinatedentry.housinginventory.web.rest.util.HeaderUtil.createEntityDeletionAlert("housingUnitAssignment", id.toString())).build();
}