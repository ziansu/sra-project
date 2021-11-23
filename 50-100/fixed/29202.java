@java.lang.Override
public java.util.List<java.lang.String> getAllRoomNumbers() {
    javax.ws.rs.client.WebTarget path = query.path("/getAllRoomNumbers");
    java.util.List<java.lang.String> customerAndRooms = path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<java.lang.String>>() {    });
    return customerAndRooms;
}