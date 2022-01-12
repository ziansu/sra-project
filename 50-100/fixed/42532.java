@org.springframework.web.bind.annotation.RequestMapping(value = "/registerInfo.html", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String registerInfo(com.autoparts.login.model.UserDto userDto, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    userDto.setId(((java.lang.String) (session.getAttribute("id"))));
    if ((userDto.getReq()) == null) {
        userDto.setReq("");
    }
    userService.insertUserInfo(userDto);
    return "main/main.tiles";
}