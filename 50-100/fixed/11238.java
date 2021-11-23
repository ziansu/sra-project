@org.springframework.web.bind.annotation.RequestMapping(value = "/loginaction", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String loginAction(com.acae.entity.UserProfile user, javax.servlet.http.HttpSession session) {
    com.acae.entity.UserProfile userProfile = loginService.getUserProfile(user.getUserId(), user.getPassword());
    if (userProfile != null) {
        session.setAttribute("userProfile", userProfile);
        return "/index";
    }else {
        session.setAttribute("errorMessage", "Wrong User ID or Password");
        return "/menu/login";
    }
}