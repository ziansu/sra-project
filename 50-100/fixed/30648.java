public void getMap(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    nl.tudelft.contextproject.webinterface.WebClient client = server.getUser(request);
    if (!(checkAuthorized(client, response, true)))
        return ;
    
    org.json.JSONObject json = nl.tudelft.contextproject.webinterface.temp.WebLevel2.testLevel().toJSON();
    response.setStatus(HttpStatus.OK_200);
    response.setContentType("text/json");
    response.getWriter().write(json.toString());
}