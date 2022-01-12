@java.lang.Override
public java.util.List<java.lang.String> getAllRoomNumbers() {
    javax.ws.rs.client.WebTarget path = query.path("/getAllRoomNumbers");
    path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<java.lang.String>>() {    });
    java.util.List<java.lang.String> customerAndRooms = path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<java.lang.String>>() {    });
    return customerAndRooms;
}