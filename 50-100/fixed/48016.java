@java.lang.Override
public void doFilter(com.epam.javalab.webapp.filter.ServletRequest servletRequest, com.epam.javalab.webapp.filter.ServletResponse servletResponse, com.epam.javalab.webapp.filter.FilterChain filterChain) throws com.epam.javalab.webapp.filter.ServletException, java.io.IOException {
    if (sessionBean.getUser().getRole().equals(Role.ADMIN)) {
        filterChain.doFilter(servletRequest, servletResponse);
    }else {
        javax.faces.application.FacesMessage message = new javax.faces.application.FacesMessage("You're not admin");
        facesContext.addMessage(null, message);
    }
}