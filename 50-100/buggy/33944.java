@org.spring.Controller.CrossOrigin
@org.spring.Controller.PostMapping(value = "/menu/create")
@org.spring.Controller.ResponseBody
public java.lang.String CreateItem(@org.spring.Controller.RequestParam(value = "name")
java.lang.String iName, @org.spring.Controller.RequestParam(value = "description")
java.lang.String iDescription, @org.spring.Controller.RequestHeader(value = "token")
java.lang.String token, javax.servlet.http.HttpServletResponse httpServletResponse) {
    int userAccess = GetUserAccessFromToken(token);
    if (userAccess > 0) {
        try {
            template.update("INSERT INTO MenuBook (ItemName,ItemDescription) VALUES (?,?)", new java.lang.Object[]{ iName , iDescription });
            return "";
        } catch (java.lang.Exception ex) {
            httpServletResponse.setStatus(400);
            return ("{ \"errorMessage\" : \"Operation failed, error message is : " + (ex.getMessage())) + "\" } ";
        }
    }
    return "{ \"errorMessage\" : \"Access denied\" } ";
}