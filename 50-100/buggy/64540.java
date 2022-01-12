@org.springframework.web.bind.annotation.RequestMapping(value = "landing", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loadLanding(org.springframework.ui.ModelMap map, javax.servlet.http.HttpSession session, com.ssbb.kanban.data.impl.User user) {
    if (null != (session.getAttribute(Constants.USER))) {
        map.addAttribute(Constants.PROJECT, project);
        if (null == (session.getAttribute(Constants.PROJECT_LIST))) {
            session.setAttribute(Constants.PROJECT_LIST, projectDAO.getProjectsByUser(user));
        }
        return "landing";
    }
    return "redirect:/home";
}