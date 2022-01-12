@br.edu.ufcg.es.controller.RequestMapping(value = "/register", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public org.springframework.http.ResponseEntity<java.lang.String> registerUser(@javax.validation.Valid
@br.edu.ufcg.es.controller.RequestBody
br.edu.ufcg.es.model.DTO.RegisterUser registerUser) {
    br.edu.ufcg.es.model.User user = new br.edu.ufcg.es.model.User(registerUser.getName(), registerUser.getEmail(), registerUser.getPassword(), registerUser.getPhone(), registerUser.getAddress());
    userService.create(user);
    return new org.springframework.http.ResponseEntity("Cadastro realizado com sucesso.", org.springframework.http.HttpStatus.CREATED);
}