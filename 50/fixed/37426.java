@org.springframework.web.bind.annotation.RequestMapping(value = "/findbypassword/{password}")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.java4.des.entity.User> findByPassword(@org.springframework.web.bind.annotation.PathVariable
java.lang.String password) {
    java.lang.System.out.println("In findByPassword!");
    java.util.List<com.java4.des.entity.User> list = this.userService.findUserByPassword(password);
    return list;
}