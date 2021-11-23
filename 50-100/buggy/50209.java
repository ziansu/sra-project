@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler) throws java.lang.Exception {
    request.setAttribute("greeting", "We hope you have a scary and fun filled Halloween!");
    java.lang.String location = request.getParameter("locationName");
    if (location != null) {
        request.setAttribute("location", location);
    }
    return true;
}