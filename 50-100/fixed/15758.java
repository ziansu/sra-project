@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.Integer id = java.lang.Integer.parseInt(request.getParameter("id"));
    com.shop.model.ProductDto product = com.shop.service.ProductService.productService().getProductById(id);
    request.setAttribute("id", id);
    request.setAttribute("product", product);
    request.getRequestDispatcher("edit.jsp").forward(request, response);
}