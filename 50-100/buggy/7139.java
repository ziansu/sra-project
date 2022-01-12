@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/getUserFromToken")
@javax.ws.rs.Consumes(value = MediaType.APPLICATION_JSON)
public list.nice.ajax.Response getUserFromToken(javax.xml.bind.JAXBElement<list.nice.dal.dto.Token> token) throws java.io.UnsupportedEncodingException, java.security.GeneralSecurityException {
    list.nice.dal.dto.Token tokenReal = token.getValue();
    return list.nice.ajax.Response.status(Response.Status.OK).header("Access-Control-Allow-Origin", "*").entity(list.nice.bll.UserBLL.wipeSensitiveFields(list.nice.bll.UserBLL.getUser(tokenReal.selector, tokenReal.validator))).build();
}