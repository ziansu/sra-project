@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "/deletetransaktion")
public java.lang.String deleteTransaktion(java.lang.String input) {
    java.lang.System.out.println((("input <" + input) + ">"));
    try {
        konto.data.DBUtil.ITransaktion transaktionUtil = new konto.data.DBUtil.TransaktionDBUtil();
        konto.data.model.Transaktion transaktion = buildTransaktion(input);
        transaktionUtil.deleteTransaktion(transaktion);
        return "delete Transaktion: " + (transaktion.toString());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Error while update of transaktion:\n" + (e.toString());
    }
}