@org.springframework.web.bind.annotation.RequestMapping(value = "/check/{code}")
@io.swagger.annotations.ApiOperation(value = "Check if code is used by another category", httpMethod = "GET")
public org.springframework.http.ResponseEntity<java.lang.Void> checkCode(@io.swagger.annotations.ApiParam(name = "id", required = false, value = "Category Id")
@org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
java.lang.String id, @io.swagger.annotations.ApiParam(name = "code", required = true, value = "Code to check")
@org.springframework.web.bind.annotation.PathVariable(value = "code")
java.lang.String code) {
    fr.emse.ewall.model.Category category = categoryRepository.findByCode(code);
    if ((category == null) || ((id != null) && (category.getId().equals(id)))) {
        return org.springframework.http.ResponseEntity.ok().build();
    }
    return org.springframework.http.ResponseEntity.status(HttpStatus.CONFLICT).build();
}