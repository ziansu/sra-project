@org.springframework.web.bind.annotation.RequestMapping(value = com.insframe.server.rest.UserController.MODIFY_USER, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.insframe.server.model.User modifyUser(@org.springframework.web.bind.annotation.RequestBody
com.insframe.server.model.User user) {
    if (user != null) {
        return userService.updateUser(user);
    }else {
        return null;
    }
}