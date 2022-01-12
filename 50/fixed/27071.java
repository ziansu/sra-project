@pl.ttsoft.editems.controllers.DeleteMapping(value = "/playergroups/{id}")
public org.springframework.http.ResponseEntity<java.lang.Long> deletePlayerGroup(@pl.ttsoft.editems.controllers.PathVariable
java.lang.Long id) {
    return new org.springframework.http.ResponseEntity(kabaService.usunGrupeOdtwarzaczy(id), org.springframework.http.HttpStatus.OK);
}