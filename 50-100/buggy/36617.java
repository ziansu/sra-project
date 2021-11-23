@org.springframework.web.bind.annotation.RequestMapping(value = "/userManagementService/addUser", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public int addUser(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam(value = "username")
java.lang.String username, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password) {
    com.user.register.micro.endpoint.User user = new com.user.register.micro.endpoint.User();
    user.setUsername(username);
    user.setPassword(password);
    user.setRole("ROLE_USER");
    user.setEnabled(true);
    return userManagementDaoService.add(user);
}