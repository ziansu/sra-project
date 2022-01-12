@com.foodvotebox.controller.RequestMapping(value = "/")
public java.lang.String index(javax.servlet.http.HttpSession session) {
    if (session != null) {
        com.foodvotebox.pojo.FvbUser user = ((com.foodvotebox.pojo.FvbUser) (session.getAttribute("newUser")));
        if (user != null) {
            return "redirect:" + (user.getUsername());
        }
    }
    return "login";
}