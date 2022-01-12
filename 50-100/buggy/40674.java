@com.foodvotebox.controller.RequestMapping(value = "/")
public java.lang.String index(javax.servlet.http.HttpSession session) {
    if (session != null) {
        com.foodvotebox.pojo.FvbUser user = ((com.foodvotebox.pojo.FvbUser) (session.getAttribute("newUser")));
        if (user != null) {
            com.FoodVoteBox.exception.UserServiceEnum loginType = loginService.login(user.getEmail(), user.getEmail(), user.getPassword());
            if (loginType == (com.FoodVoteBox.exception.UserServiceEnum.SIGNIN_SUCCESS)) {
                return "redirect:" + (user.getUsername());
            }
        }
    }
    return "login";
}