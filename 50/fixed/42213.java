@java.lang.Override
public void doFilter(ua.savelichev.electronic.ui.filters.ServletRequest servletRequest, ua.savelichev.electronic.ui.filters.ServletResponse servletResponse, ua.savelichev.electronic.ui.filters.FilterChain filterChain) throws java.io.IOException, ua.savelichev.electronic.ui.filters.ServletException {
    servletRequest.setCharacterEncoding("UTF-8");
    servletResponse.setCharacterEncoding("UTF-8");
    filterChain.doFilter(servletRequest, servletResponse);
}