@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView modelAndView) {
    if (!(modelAndView.getViewName().contains("redirect:"))) {
        int newPmCount = service.currentUserNewPmCount();
        request.setAttribute("newPmCount", newPmCount);
        org.jtalks.jcommune.model.entity.User user = securityService.getCurrentUser();
        java.lang.String encodedUserName = (user != null) ? user.getEncodedUsername() : null;
        request.setAttribute("encodedUserName", encodedUserName);
    }
}