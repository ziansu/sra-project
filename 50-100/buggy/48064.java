@org.springframework.web.bind.annotation.RequestMapping(value = "/Logout")
public java.lang.String Logout(org.springframework.ui.ModelMap model, javax.servlet.http.HttpSession session, org.springframework.web.bind.support.SessionStatus status) {
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("Beans.xml");
    com.tutorial.UserJDBCTemplate studentJDBCTemplate = ((com.tutorial.UserJDBCTemplate) (context.getBean("userJDBCTemplate")));
    java.lang.System.out.print("inside logout");
    studentJDBCTemplate.deleteOnline(((java.lang.String) (model.get("user"))));
    status.setComplete();
    session.removeAttribute("user");
    model.remove("user");
    return "redirect:/Login";
}