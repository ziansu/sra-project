protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    session.setRequest(request);
    session.setSession(request.getSession());
    transfer.domain.Customer customer = null;
    try {
        customer = validateUserInputtedRegistrationFormFieldsAndBuildCustomer(request);
        doCustomerRegistration(customer);
    } catch (java.lang.Exception exception) {
        exception.printStackTrace();
        updateSessionExceptionError(exception, request);
        forwardToErrorPage(request, response);
    }
    returnToBackPage(request, response);
}