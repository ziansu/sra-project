@org.springframework.web.bind.annotation.RequestMapping(value = "/authorization", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.ivanovdmitry.Response authorization(@org.springframework.web.bind.annotation.RequestParam(value = "username")
java.lang.String username, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password) {
    if (!(com.ivanovdmitry.RestApiController.checkParam(username))) {
        return new com.ivanovdmitry.Response("Wrong username");
    }
    com.ivanovdmitry.model.User user = userService.findByUsername(username);
    if (user == null) {
        return new com.ivanovdmitry.Response("User not found");
    }
    if (user.getPassword().equals(password)) {
        return new com.ivanovdmitry.Response("Success");
    }
    return new com.ivanovdmitry.Response("Wrong password");
}