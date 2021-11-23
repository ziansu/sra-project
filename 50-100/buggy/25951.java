protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if (((request.getParameter("page")) != null) && (!(request.getParameter("page").equals("")))) {
        doPost(request, response);
    }else {
    }
    request.getRequestDispatcher("/InventorySearch.jsp").forward(request, response);
    return ;
}