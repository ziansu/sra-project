@javax.ws.rs.GET
public javax.ws.rs.core.Response findAll() throws org.json.JSONException {
    java.util.List<com.myexercise.contracts.Contract> list = repo.findAll();
    java.lang.String result = "";
    for (com.myexercise.contracts.Contract obj : list)
        result += obj.toString();
    
    return javax.ws.rs.core.Response.status(200).entity(result).build();
}