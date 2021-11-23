@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/findbypassword/{password}")
public java.util.List<com.java4.des.entity.User> findByPassword(@org.springframework.web.bind.annotation.PathVariable
java.lang.String password) {
    java.lang.System.out.println("In findByPassword!");
    return this.userService.findUserByPassword(password);
}