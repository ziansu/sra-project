@org.springframework.web.bind.annotation.RequestMapping(value = "/list/{currentPage}")
public org.springframework.web.servlet.ModelAndView list(org.springframework.web.servlet.ModelAndView mav, javax.servlet.http.HttpSession session, @org.springframework.web.bind.annotation.PathVariable(value = "currentPage")
int currentPage) {
    com.henry.entity.User user = ((com.henry.entity.User) (session.getAttribute("user")));
    com.henry.entity.Page<com.henry.entity.Password> page = passwordService.findPasswords(user.getId(), 3, currentPage);
    mav.setViewName("show");
    mav.addObject("page", page);
    return mav;
}