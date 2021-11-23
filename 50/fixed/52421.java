@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public org.springframework.http.ResponseEntity deleteUser(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name) {
    if (userAgent.checkIfInDb(name)) {
        userAgent.removeFromDb(name);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
}