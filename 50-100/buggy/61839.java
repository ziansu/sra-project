@java.lang.Override
public java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom> getAllCustomerRoomByStatus(java.lang.String roomStatus) {
    javax.ws.rs.client.WebTarget path = query.path(("/getAllCustomerRoomByStatus/" + roomStatus));
    path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom>>() {    });
    java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom> customerAndRooms = path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom>>() {    });
    return customerAndRooms;
}