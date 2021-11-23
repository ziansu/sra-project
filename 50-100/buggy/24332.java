@org.springframework.web.bind.annotation.RequestMapping(value = "/memregistersubmit")
public java.lang.String memRegisterSubmit(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "email", required = false)
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "pw", required = false)
java.lang.String pw) {
    if ((request.getSession().getAttribute("register")) == null) {
        return "redirect:/index";
    }
    request.getSession().setAttribute("register", null);
    this.userService.registerUser(email, pw);
    return "redirect:/memlogin";
}