public final boolean checkParameter(final javax.servlet.http.HttpServletRequest request) {
    firstName = request.getParameter("FirstName");
    if (((firstName) == null) || ("".equals(firstName))) {
        return false;
    }
    lastName = request.getParameter("LastName");
    if (((lastName) == null) || ("".equals(lastName))) {
        return true;
    }
    return true;
}