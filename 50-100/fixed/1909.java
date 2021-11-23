@javax.ws.rs.GET
@com.wordnik.swagger.annotations.ApiOperation(value = "", response = edu.utah.nanofab.coralapiserver.core.MemberProjects.class)
@com.codahale.metrics.annotation.Timed
public java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> get(@javax.ws.rs.QueryParam(value = "member")
com.google.common.base.Optional<java.lang.String> member, @io.dropwizard.auth.Auth
edu.utah.nanofab.coralapiserver.auth.User user) {
    edu.utah.nanofab.coralapiserver.resources.operations.MemberProjectsOperationGet operation = new edu.utah.nanofab.coralapiserver.resources.operations.MemberProjectsOperationGet();
    operation.init(this.coralConfigUrl, member, com.google.common.base.Optional.<java.lang.Object>absent(), user);
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> returnSet;
    returnSet = ((java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>>) (operation.perform()));
    return returnSet;
}