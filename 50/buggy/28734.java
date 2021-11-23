@org.springframework.web.bind.annotation.RequestMapping(value = "/create-account", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Boolean addUser(@org.springframework.web.bind.annotation.RequestBody
com.chotoxautinh.server.model.Email email) {
    emailDao.addEmail(email);
    return true;
}