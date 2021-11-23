private void writeValue(java.lang.String customer, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    edu.pdx.cs410J.jonerik.PhoneBill bill = this.bills.get(customer);
    edu.pdx.cs410J.jonerik.PrettyPrinter prettify = new edu.pdx.cs410J.jonerik.PrettyPrinter(response.getWriter());
    prettify.dump(bill);
    response.setStatus(HttpServletResponse.SC_OK);
}