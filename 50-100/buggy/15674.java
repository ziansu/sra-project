@javax.ws.rs.Path(value = "/ditte/{howmany:.*}")
@javax.ws.rs.GET
public java.lang.String getListMisuratoriFiscale(@javax.ws.rs.PathParam(value = "howmany")
java.lang.String numeroelementi) {
    try {
        if (numeroelementi.equals("all")) {
        }
        isti.cnr.sse.rest.data.Ditte d = new isti.cnr.sse.rest.data.Ditte();
        d.setListaDitte(((java.util.List<isti.cnr.sse.rest.data.Ditta>) (isti.cnr.sse.rest.impl.APITestHWImpl.map.values())));
        com.google.gson.Gson g = new com.google.gson.Gson();
        return g.toJson(d);
    } catch (java.lang.Exception e) {
        isti.cnr.sse.rest.impl.APITestHWImpl.log.fatal(("Fatal " + (e.getMessage())));
        return null;
    }
}