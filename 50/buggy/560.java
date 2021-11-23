public javax.servlet.http.HttpServletRequest wrapRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    request.setAttribute(org.springframework.session.web.http.HttpSessionManager.class.getName(), this);
    return request;
}