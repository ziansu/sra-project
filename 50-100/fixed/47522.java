@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/einloggen")
public javax.ws.rs.core.Response einloggen(@javax.ws.rs.FormParam(value = "vn")
java.lang.String vorname, @javax.ws.rs.FormParam(value = "nn")
java.lang.String nachname) throws java.lang.Exception {
    if (vorname.equals("Seven")) {
        javax.ws.rs.core.Response r = javax.ws.rs.core.Response.seeOther(new java.net.URI("/FerienWohnungVerwaltung/buchen")).build();
        return r;
    }else {
        javax.ws.rs.core.Response r = javax.ws.rs.core.Response.seeOther(new java.net.URI("/FerienWohnungVerwaltung/WohnungAnlegen")).build();
        return r;
    }
}