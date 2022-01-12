@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    dbHelpers.ReadQuery rq = new dbHelpers.ReadQuery();
    rq.doRead();
    java.lang.String table = rq.getHTMLTable();
    request.setAttribute("table", table);
    java.lang.String url = "/read.jsp";
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
    processRequest(request, response);
}