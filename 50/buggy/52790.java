@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<?> addOperation(@org.springframework.web.bind.annotation.RequestBody
com.saeler.dto.operation.OperationAttributesDto operation) {
    try {
        operationsService.createOperation(operation);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CREATED);
    } catch (java.text.ParseException e) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.BAD_REQUEST);
    }
}