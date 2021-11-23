private void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    com.pavluchenko.command.Command command = com.pavluchenko.command.CommandFactory.getCommand(request);
    java.lang.String page;
    page = command.execute(request, response);
    java.lang.System.out.println(("page is " + page));
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher(page);
    if (dispatcher != null) {
        dispatcher.forward(request, response);
    }else {
    }
}