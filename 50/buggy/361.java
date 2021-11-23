@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.System.out.println(request.getAttribute("msg"));
    return "login";
}