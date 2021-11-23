public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String obj = request.getParameter("editId");
    int id = (obj != null) ? java.lang.Integer.valueOf(obj).intValue() : 0;
    com.dio.warehousespring.StorageWebState storageWebState = ((com.dio.warehousespring.StorageWebState) (request.getAttribute("storageWebState")));
    request.setAttribute("item", storageWebState.getCurrentStorage().getItemById(id));
    com.dio.warehousespring.TV filterChain;
    doFilter(request, response);
}