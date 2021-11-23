@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT, produces = "application/json", value = "/{id}")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String alterar(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, @org.springframework.web.bind.annotation.RequestBody
br.com.api.capsrnrb.models.User usuarios, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.String status = java.lang.String.valueOf(response.getStatus());
    serviceUser.editUser(usuarios);
    return status;
}