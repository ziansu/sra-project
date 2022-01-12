@org.springframework.web.bind.annotation.RequestMapping(value = "/sport")
public org.springframework.web.servlet.ModelAndView sportQueryView(javax.servlet.http.HttpServletRequest request) {
    org.springframework.web.servlet.ModelAndView view = new org.springframework.web.servlet.ModelAndView("query/sport");
    int userId = getUserIdBySession(session);
    java.util.Map<java.lang.String, java.lang.Object> result = queryService.getSportByStudentId(userId);
    view.addAllObjects(result);
    return view;
}