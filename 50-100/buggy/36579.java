@org.springframework.web.bind.annotation.RequestMapping(value = "", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = { "application/json" , "application/xml" }, produces = { "application/json" , "application/xml" })
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
@com.wordnik.swagger.annotations.ApiOperation(value = "Create a user.", notes = "Returns the URL of the new resource in the Location header.")
public void createUser(@org.springframework.web.bind.annotation.RequestBody
com.systrangroup.web.template.example.domain.User user, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    com.systrangroup.web.template.example.domain.User savedUser = this.businessService.createUser(user);
    response.setHeader("Location", request.getRequestURL().append("/").append(savedUser.getId()).toString());
}