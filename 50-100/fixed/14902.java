public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    java.io.PrintWriter out = response.getWriter();
    java.lang.String expression = request.getParameter("expression");
    expression = processExpression(expression);
    try {
        java.math.BigDecimal result = new com.udojava.evalex.Expression(expression).eval();
        java.lang.String output = result.toString();
        _expressionRecords.add(expression, output);
        out.print(output);
    } catch (java.lang.Exception e) {
        out.print(e.getMessage());
    }
}