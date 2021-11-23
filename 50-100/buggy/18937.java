@org.springframework.web.bind.annotation.RequestMapping(value = "/connect", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String Connect(javax.servlet.http.HttpServletRequest request) {
    java.lang.String dbName = request.getParameter("dataBase");
    java.lang.String userName = request.getParameter("userName");
    java.lang.String password = request.getParameter("password");
    if (((dbName != null) && (userName != null)) && (password != null)) {
        manager.connect(((manager.getURL()) + dbName), userName, password);
        return "redirect:commands";
    }else {
        return "connect";
    }
}