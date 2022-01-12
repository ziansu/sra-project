@java.lang.Override
public java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom> getAllCustomerRoom() {
    javax.ws.rs.client.WebTarget path = query.path("/getAllCustomerRoom");
    java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom> customerAndRooms = path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<com.edu.mum.hbs.entity.CustomerAndRoom>>() {    });
    return customerAndRooms;
}