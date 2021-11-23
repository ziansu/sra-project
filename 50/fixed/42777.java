@org.springframework.web.bind.annotation.RequestMapping(value = "/registration", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String submit(org.springframework.ui.Model model, javax.servlet.http.HttpSession session, @org.springframework.web.bind.annotation.ModelAttribute(value = "bean")
com.elsbook.web.controller.RegistrationBean bean) {
    java.lang.System.out.println(bean.toString());
    return "registration";
}