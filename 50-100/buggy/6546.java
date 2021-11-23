private void moveToCartPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpSession session, ctrl.CartModel cm) throws java.io.IOException, javax.servlet.ServletException {
    ctrl.CartBean cart = ((ctrl.CartBean) (session.getAttribute("cartlist")));
    cart.computeTotal();
    session.removeAttribute("bookPreviewing");
    session.setAttribute("lastTarget", "/Home.jspx");
    java.lang.String target = "/Cart.jspx";
    request.getRequestDispatcher(target).forward(request, response);
}