@unal.architecture.rest.Path(value = "me")
@unal.architecture.rest.GET
public unal.architecture.entity.User me(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    java.lang.Long userId = ((java.lang.Long) (request.getSession().getAttribute("user")));
    userId = 1L;
    if (userId == null)
        throw new unal.architecture.rest.NotAuthorizedException("");
    
    return em.find(unal.architecture.entity.User.class, userId);
}