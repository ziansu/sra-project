@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    calcDao = new CalcDao();
    Calc[] calcs = calcDao.findAll();
    request.setAttribute("list", calcs);
    javax.servlet.RequestDispatcher view = request.getRequestDispatcher("calc-list.jsp");
    view.forward(request, response);
}