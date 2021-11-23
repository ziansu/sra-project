@org.springframework.web.bind.annotation.RequestMapping(value = com.insframe.server.rest.UserController.MODIFY_USER, method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public com.insframe.server.model.User modifyUser(@org.springframework.web.bind.annotation.RequestBody
com.insframe.server.model.User user) {
    java.lang.System.out.println(user);
    if (user != null) {
        return userService.updateUser(user);
    }else {
        return null;
    }
}