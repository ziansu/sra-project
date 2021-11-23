@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{parameter}/highscorelist")
public javax.ws.rs.core.Response highScoreResults(@javax.ws.rs.PathParam(value = "parameter")
int parameter, @javax.ws.rs.DefaultValue(value = "Login Succesful")
@javax.ws.rs.QueryParam(value = "value")
java.lang.String value) {
    java.lang.String listHighScores = getListHighScores(parameter, context);
    java.lang.String output = "";
    if (listHighScores != null) {
        output = listHighScores;
    }
    return javax.ws.rs.core.Response.status(200).entity(output).build();
}