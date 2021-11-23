@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String login(javax.servlet.http.HttpSession session) {
    java.lang.String email = ((java.lang.String) (session.getAttribute("email")));
    if (email != null) {
        session.setAttribute("fList", sharedFunc.getFunctionListFromEmail(email));
        java.lang.System.out.println(("fList Login: " + (sharedFunc.getFunctionListFromEmail(email))));
        return "redirect:/admin/index.html";
    }
    return "admin/login";
}