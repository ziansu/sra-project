protected void service(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    assert request != null : "The request from client is null";
    assert response != null : "The response to client is null";
    java.lang.String messageUpdateConfirmation = "Iniciada";
    boolean wasUpdated;
    wasUpdated = sendToProductDAO(request);
    if (wasUpdated) {
        messageUpdateConfirmation = "Produto atualizado com sucesso!";
    }else {
        messageUpdateConfirmation = "Produto não foi atualizado!";
    }
    request.setAttribute("mensage", messageUpdateConfirmation);
    javax.servlet.RequestDispatcher rd;
    rd = request.getRequestDispatcher("/ProductResponse.jsp");
    rd.forward(request, response);
}