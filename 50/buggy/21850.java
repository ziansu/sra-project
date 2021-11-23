@org.springframework.web.bind.annotation.RequestMapping(path = "/SignUp", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void SignUp(@org.springframework.web.bind.annotation.RequestBody
webdoctor.jooq.tables.pojos.User user) {
    java.lang.System.out.println("Success");
    java.lang.System.out.println(user);
    return ;
}