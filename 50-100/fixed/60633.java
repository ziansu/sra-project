protected void save(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    cn.oocl.model.Product product = new cn.oocl.model.Product();
    product.setName(request.getParameter("name"));
    product.setPrice(new java.math.BigDecimal(request.getParameter("price")));
    product.setRemark(request.getParameter("remark"));
    productService.save(product);
}