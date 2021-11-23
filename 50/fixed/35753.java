@org.springframework.web.bind.annotation.RequestMapping(value = "/*")
public java.lang.String getRequest(javax.servlet.http.HttpServletRequest request) {
    java.lang.String basket = request.getParameter("basket");
    com.nathan.Basket myBasket = new com.nathan.Basket();
    myBasket.populateBasket(basket);
    java.lang.String response = myBasket.getReceipt();
    return response;
}