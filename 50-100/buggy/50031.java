private void showResult(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String input) throws java.io.IOException, javax.servlet.ServletException {
    int number = java.lang.Integer.parseInt(input);
    boolean isPrime = primeChecker(number);
    request.setAttribute("prime", isPrime);
    request.setAttribute("number", number);
    dispatchView(request, response, servlet.PrimeCheckerServlet.RESULT_VIEW);
}