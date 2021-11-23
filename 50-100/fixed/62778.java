@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/friends")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String medical() {
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    org.json.simple.JSONObject jsonObject;
    try {
        java.lang.Object obj = parser.parse(new java.io.FileReader("my_friends.json"));
        jsonObject = ((org.json.simple.JSONObject) (obj));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.json.simple.parser.ParseException e) {
        e.printStackTrace();
    }
    return jsonObject;
}