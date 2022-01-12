@org.springframework.web.bind.annotation.RequestMapping(value = "/user", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void adduser(@org.springframework.web.bind.annotation.RequestBody
com.catalyst.springboot.entities.EndUser user) {
    userService.add(user);
}