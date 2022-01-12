@org.springframework.web.bind.annotation.RequestMapping(value = "/mainpage")
public org.springframework.web.servlet.ModelAndView mainpage(javax.servlet.http.HttpSession session) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
    java.lang.String sid = ((java.lang.String) (session.getAttribute("sid")));
    entity.Student_info studentinfo = studao.getStudentinfoBysid(sid);
    session.setAttribute("sname", studentinfo.getSname());
    mav.setViewName("mainpage");
    mav.addObject("student", studentinfo);
    return mav;
}