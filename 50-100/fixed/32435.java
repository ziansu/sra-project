@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "kontakt")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response updateKontakt(ch.issueman.common.Kontakt t, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    rbm.get("kontakt").setLogin(((ch.issueman.common.Login) (request.getSession(true).getAttribute("login"))));
    return ((ch.issueman.webservice.DAOResponseBuilder) (rbm.get("kontakt"))).update(t);
}