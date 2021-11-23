@org.springframework.web.bind.annotation.PostMapping(value = "/somedto")
public org.springframework.http.ResponseEntity processSomeDTO(@org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
com.example.demo.dto.SomeDTO someDTO) {
    service.processSomeDTO(someDTO);
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
}