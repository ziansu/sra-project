@org.springframework.web.bind.annotation.RequestMapping(value = "/chatbox")
public org.springframework.web.servlet.ModelAndView chatBox(org.springframework.ui.ModelMap model, org.springframework.web.servlet.ModelAndView mod) {
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("Beans.xml");
    com.tutorial.UserJDBCTemplate studentJDBCTemplate = ((com.tutorial.UserJDBCTemplate) (context.getBean("userJDBCTemplate")));
    java.util.List<com.tutorial.User> listContact = studentJDBCTemplate.listUser();
    if (model.isEmpty()) {
        mod.setViewName("redirect:/Login");
        return mod;
    }else {
        mod.addObject("listContact", listContact);
        mod.setViewName("chatbox");
        return mod;
    }
}