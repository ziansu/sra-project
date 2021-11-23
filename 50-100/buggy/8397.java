@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = { org.springframework.web.bind.annotation.RequestMethod.GET })
@org.springframework.web.bind.annotation.ResponseBody
public void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    java.lang.System.out.println("logout controller");
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null) {
        session.invalidate();
        java.lang.System.out.println("lougout success");
        resp.sendRedirect("index.html");
    }
}