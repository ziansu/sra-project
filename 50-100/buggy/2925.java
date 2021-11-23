@org.springframework.web.bind.annotation.RequestMapping(value = "/rowsFind", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.String> rowsFind(@org.springframework.web.bind.annotation.RequestParam
java.lang.String find) {
    long rows = paginationServiceImp.rowsFind(find);
    if (rows == 0) {
        return new org.springframework.http.ResponseEntity<java.lang.String>(org.springframework.http.HttpStatus.BAD_REQUEST);
    }
    return org.springframework.http.ResponseEntity.ok(java.lang.String.valueOf(rows));
}