@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "{userNumber}")
javax.ws.rs.core.Response updateUser(@javax.ws.rs.PathParam(value = "userNumber")
java.lang.Long userNumber, se.teknikhogskolan.jaxson.model.UserDto user);