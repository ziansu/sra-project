@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/get", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String getData(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestHeader(value = "Accept")
java.lang.String accept, @org.springframework.web.bind.annotation.RequestBody
java.lang.String xml) throws edu.asu.qstore4s.exception.InvalidDataException, edu.asu.qstore4s.exception.ParserException, java.io.IOException, java.net.URISyntaxException, java.text.ParseException, org.json.JSONException {
    if (xml.equals("")) {
        throw new edu.asu.qstore4s.exception.InvalidDataException("Please provide content in given XML.");
    }
    java.lang.String returnString = repositorymanager.getList(xml, accept);
    response.setContentType(accept);
    return returnString;
}