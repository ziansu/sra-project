@org.springframework.web.bind.annotation.RequestMapping(path = "userListResources.do")
public org.springframework.web.servlet.ModelAndView userListResources(@org.springframework.web.bind.annotation.ModelAttribute(value = "userId")
java.lang.Integer id, @org.springframework.web.bind.annotation.ModelAttribute(value = "auth")
java.lang.String auth) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("userprofile.jsp");
    entities.User u = dao.getUserById(id);
    java.util.List<entities.Resource> resources = dao.getAllResourcesById(id);
    mv.addObject("resources", resources);
    mv.addObject("user", u);
    return mv;
}