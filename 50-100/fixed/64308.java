protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.setCharacterEncoding("UTF-8");
    float distance = calculateDistance(request);
    com.netcracker.ejb.PriceBeanLocal priceBean = getPriceBean(request);
    double price = priceBean.calculatePrice(distance, com.netcracker.tss.web.util.DateParser.parseDate(request));
    java.lang.String text = java.lang.String.valueOf(price);
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(text);
}