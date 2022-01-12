@org.springframework.web.bind.annotation.CrossOrigin
@com.fasterxml.jackson.annotation.JsonView(value = es.urjc.code.daw.api.RESTUserController.UserView.class)
@org.springframework.web.bind.annotation.RequestMapping(value = "/logIn")
public org.springframework.http.ResponseEntity<es.urjc.code.daw.api.User> logIn() {
    if (!(userComponent.isLoggedUser())) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.UNAUTHORIZED);
    }else {
        long id = userComponent.getLoggedUser().getId();
        return new org.springframework.http.ResponseEntity(userservice.findOne(id), org.springframework.http.HttpStatus.OK);
    }
}