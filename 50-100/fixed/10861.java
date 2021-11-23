private java.util.List<com.netcracker.entity.helper.TaxiOrderHistory> getHistory(java.lang.Integer pageNumber, javax.servlet.http.HttpServletRequest req) {
    com.netcracker.ejb.TaxiOrderBeanLocal taxiOrderBeanLocal = getTaxiOrderBean(req);
    java.util.List<com.netcracker.entity.helper.TaxiOrderHistory> list = taxiOrderBeanLocal.getTaxiOrderHistory(pageNumber, com.netcracker.tss.web.servlet.customer.CustomerOrderTaxiHistoryServlet.pageSize, findCurrentUser());
    if (((list.size()) == 0) && (pageNumber > 1)) {
        pageNumber--;
        getServletContext().setAttribute("pageNumber", pageNumber);
        list = taxiOrderBeanLocal.getTaxiOrderHistory(pageNumber, com.netcracker.tss.web.servlet.customer.CustomerOrderTaxiHistoryServlet.pageSize, findCurrentUser());
    }
    return list;
}