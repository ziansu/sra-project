@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT, value = "/user/editmail")
public org.springframework.http.ResponseEntity<?> editMail(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
tabletop.domain.user.User user, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        java.lang.System.out.println("Server in hasErrors");
        return tabletop.controllers.utils.ResponseUtils.badRequest(errors);
    }
    java.lang.System.out.println("Server after hasErrors");
    return tabletop.controllers.utils.ResponseUtils.created(userService.editMail(user));
}