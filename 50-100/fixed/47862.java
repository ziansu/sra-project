public static org.jala.efeeder.api.command.In createIn(javax.servlet.http.HttpServletRequest request) {
    org.jala.efeeder.api.command.impl.DefaultIn in = new org.jala.efeeder.api.command.impl.DefaultIn();
    in.setUser(((org.jala.efeeder.user.User) (request.getSession().getAttribute("user"))));
    for (java.util.Map.Entry<java.lang.String, java.lang.String[]> parameter : request.getParameterMap().entrySet()) {
        in.addParameter(parameter.getKey(), java.util.Arrays.asList(parameter.getValue()));
    }
    return in;
}