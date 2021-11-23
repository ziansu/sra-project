@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String adduser(@org.springframework.web.bind.annotation.RequestBody
com.catalyst.springboot.entities.EndUser user) {
    userService.add(user);
    return login();
}