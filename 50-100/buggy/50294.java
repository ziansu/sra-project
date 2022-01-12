@org.springframework.web.bind.annotation.RequestMapping(value = "/stopVoting", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView stopVoting(@org.springframework.web.bind.annotation.RequestParam
java.lang.String token, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpSession httpSession) throws java.lang.Exception {
    com.spy.model.Room room = getRoomFromSession(httpSession);
    java.lang.String referer = request.getHeader("Referer");
    room.setStatus(Status.STARTED);
    roomDao.save(room);
    return new org.springframework.web.servlet.ModelAndView(("redirect:" + referer));
}