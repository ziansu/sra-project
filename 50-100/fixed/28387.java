@com.google.api.server.spi.config.ApiMethod(name = "saveVariable", path = "put-variable", httpMethod = com.google.api.server.spi.config.ApiMethod.HttpMethod.POST)
public dstobns.domain.BNVariable saveVariable(final com.google.appengine.api.users.User user, @javax.inject.Named(value = "uniqueId")
java.lang.Long uniqueId, @javax.inject.Named(value = "name")
java.lang.String name, @javax.inject.Named(value = "label")
java.lang.String label, @javax.inject.Named(value = "states")
java.lang.String states) throws com.google.api.server.spi.response.UnauthorizedException {
    if (user == null) {
        throw new com.google.api.server.spi.response.UnauthorizedException("Authorization required");
    }
    if (uniqueId == (-1))
        uniqueId = null;
    
    dstobns.domain.BNVariable variable = new dstobns.domain.BNVariable(uniqueId, name, label, states);
    dstobns.OfyService.ofy().save().entity(variable).now();
    return variable;
}