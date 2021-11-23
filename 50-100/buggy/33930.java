@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
@javax.ws.rs.POST
@javax.ws.rs.Path(value = "kontakt")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response persistKontakt(ch.issueman.common.Kontakt t, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    rbm.get("login").setLogin(((ch.issueman.common.Login) (request.getSession(true).getAttribute("login"))));
    return ((ch.issueman.webservice.DAOResponseBuilder) (rbm.get("kontakt"))).persist(t);
}