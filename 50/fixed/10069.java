@org.springframework.web.bind.annotation.RequestMapping(value = "forgotPassword/{forgotPassword}/email/{email}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Integer forgotPassword(@org.springframework.web.bind.annotation.PathVariable(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.PathVariable(value = "forgotPassword")
boolean forgotPassword) {
    if (forgotPassword) {
        return application.forgotPassword(email);
    }
    return 0;
}