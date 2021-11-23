public java.util.List<pl.coderslab.model.Answer> getAnswersFromSession(javax.servlet.http.HttpServletRequest request, java.lang.String sessionAttribute) {
    return ((java.util.List<pl.coderslab.model.Answer>) (request.getSession().getAttribute("sessionAttribute")));
}