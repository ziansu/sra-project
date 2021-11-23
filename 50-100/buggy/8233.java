@org.springframework.web.bind.annotation.PostMapping
public final org.springframework.http.ResponseEntity insert(@org.springframework.validation.annotation.Validated
@org.springframework.web.bind.annotation.RequestBody
final DtoT dto) throws com.teammental.meconfig.exception.entity.EntityInsertException {
    java.io.Serializable id = doInsert(dto);
    java.lang.String location = org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentContextPath().path((((getMappingUrlOfController()) + "/") + (id.toString()))).build().toUriString();
    return org.springframework.http.ResponseEntity.status(HttpStatus.CREATED).header("Location", location).build();
}