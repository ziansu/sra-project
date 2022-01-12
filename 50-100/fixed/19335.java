@com.Sor.Controller.GET
@com.Sor.Controller.Path(value = "/suggestPersons")
@com.Sor.Controller.Produces(value = MediaType.TEXT_PLAIN)
public java.lang.String getSuggestPerson(@com.Sor.Controller.QueryParam(value = "userId")
java.lang.String userId, @com.Sor.Controller.QueryParam(value = "type")
java.lang.String type, @com.Sor.Controller.Context
com.Sor.Controller.SecurityContext securityContext) throws com.Sor.Controller.NotFoundException, java.text.ParseException {
    java.util.List<com.Sor.Controller.Person> response = new java.util.ArrayList<com.Sor.Controller.Person>();
    response = search.sugestPerson(userId);
    java.lang.System.out.println(response);
    return response.toString();
}