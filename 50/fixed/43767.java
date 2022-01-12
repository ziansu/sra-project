@org.springframework.web.bind.annotation.RequestMapping(method = POST)
public org.springframework.http.ResponseEntity<fr.denoria.client.space.models.dto.UserDto> create(@org.springframework.web.bind.annotation.RequestBody
fr.denoria.client.space.models.User user) throws fr.denoria.client.space.exceptions.UserException, java.security.NoSuchAlgorithmException {
    return new org.springframework.http.ResponseEntity(new fr.denoria.client.space.models.dto.UserDto(userService.create(user)), org.springframework.http.HttpStatus.OK);
}