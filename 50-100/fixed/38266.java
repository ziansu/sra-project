@com.grandet.controller.RequestMapping(value = "/api/userLogin", method = RequestMethod.POST)
@com.grandet.controller.ResponseBody
public com.grandet.domain.User userLogin(com.grandet.domain.User user, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpSession session) {
    com.grandet.domain.User u = userService.userLogin(user.getUsername(), user.getPassword());
    if (u != null) {
        session.setAttribute("user", u);
        session.setMaxInactiveInterval((5 * 60));
        response.setStatus(200);
        return u;
    }else {
        response.setStatus(404);
        return null;
    }
}