protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if ((request.getSession().getAttribute("user")) != null) {
        request.getSession().invalidate();
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }else {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}