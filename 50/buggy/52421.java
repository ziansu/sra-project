@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public org.springframework.http.ResponseEntity deleteUser(@org.springframework.web.bind.annotation.RequestParam(value = "id")
int userId) {
    if (userAgent.checkIfInDb(userId)) {
        userAgent.removeFromDb(userId);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
}