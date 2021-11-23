protected void showServerError(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, java.lang.Throwable e) throws java.io.IOException, javax.servlet.ServletException {
    resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    req.setAttribute(com.lftechnology.batch7crud.controller.CustomHttpServlet.ERROR_MESSAGE, e.getMessage());
    req.getServletContext().getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
}