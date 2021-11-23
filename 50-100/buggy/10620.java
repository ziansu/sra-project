protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setContentType("text/html;charset=UTF-8");
    edu.wctc.da.bookwebapp.model.AuthorService authorService = new edu.wctc.da.bookwebapp.model.AuthorService();
    try {
        java.util.List<edu.wctc.da.bookwebapp.model.Author> authorList = authorService.getAuthors();
        java.lang.System.out.println("test");
        request.setAttribute(AUTHORLIST, authorList);
        request.setAttribute("errorMessage", ERRORMESSAGE);
        javax.servlet.RequestDispatcher view = request.getRequestDispatcher(DESTINATIONPAGE);
        view.forward(request, response);
    } catch (java.lang.Exception e) {
    }
}