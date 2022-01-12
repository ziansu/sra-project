private void sendResponse(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res, java.util.List<orders.LineItem> items, java.math.BigDecimal totalPrice) {
    try {
        javax.servlet.http.HttpSession session = req.getSession();
        session.setAttribute("items", item);
        session.setAttribute("total", totalPrice);
        res.sendRedirect("confirmOrder.jsp");
    } catch (java.io.IOException e) {
    }
}