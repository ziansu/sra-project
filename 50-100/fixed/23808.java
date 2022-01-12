public pl.edu.agh.student.db.model.User getUserByHttpServletRequest(javax.servlet.http.HttpServletRequest request) {
    if ((request.getSession().getAttribute("SPRING_SECURITY_CONTEXT")) != null) {
        org.springframework.social.security.SocialUser socialUser = ((org.springframework.social.security.SocialUser) (((org.springframework.security.core.context.SecurityContextImpl) (request.getSession().getAttribute("SPRING_SECURITY_CONTEXT"))).getAuthentication().getPrincipal()));
        return getUserByFacebookId(socialUser.getUserId());
    }
    return null;
}