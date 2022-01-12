private boolean controlloUtente(servlet.Utente utente, java.lang.String utenteRichiesto, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpServletRequest request) throws java.io.IOException, javax.servlet.ServletException {
    if ((!(utenteRichiesto.equals("all"))) && (!(utente.getRuolo().equals(utenteRichiesto)))) {
        javax.servlet.RequestDispatcher rd;
        rd = request.getRequestDispatcher("error.jsp");
        rd.forward(request, response);
        return false;
    }
    return true;
}