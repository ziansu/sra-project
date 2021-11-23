private long getId(javax.servlet.http.HttpServletRequest req) throws java.lang.NullPointerException {
    long result = 0;
    try {
        result = java.lang.Long.decode(req.getParameter("pattern"));
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    }
    return result;
}