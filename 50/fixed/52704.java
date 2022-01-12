@de.fau.cs.mad.kwikshop.common.rest.GET
@de.fau.cs.mad.kwikshop.common.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@io.dropwizard.hibernate.UnitOfWork
@de.fau.cs.mad.kwikshop.common.rest.annotations.RequiresLease
java.util.List<de.fau.cs.mad.kwikshop.common.ShoppingListServer> getList(@io.dropwizard.auth.Auth
de.fau.cs.mad.kwikshop.common.User user);