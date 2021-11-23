private void query(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String keyword = request.getParameter("keyword");
    java.util.List<cn.oocl.model.Product> proList = productService.queryByName(keyword, 1, 5);
    java.lang.System.out.println(proList);
    request.setAttribute("proList", proList);
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/query.jsp");
    dispatcher.forward(request, response);
}