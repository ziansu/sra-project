@org.springframework.web.bind.annotation.RequestMapping(value = "/stopVoting", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView stopVoting(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpSession httpSession) throws java.lang.Exception {
    com.spy.model.Room room = getRoomFromSession(httpSession);
    java.lang.String referer = request.getHeader("Referer");
    room.setStatus(Status.STARTED);
    roomDao.save(room);
    return new org.springframework.web.servlet.ModelAndView(("redirect:" + referer));
}