@java.lang.Override
protected void service(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.util.ArrayList<model.Quotation> quotationList = new java.util.ArrayList<model.Quotation>();
    quotationList = buildQuotationList();
    request.setAttribute("quotationList", quotationList);
    javax.servlet.RequestDispatcher rd;
    rd = request.getRequestDispatcher("/ConsultQuotationList.jsp");
    rd.forward(request, response);
}