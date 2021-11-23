@java.lang.Override
public java.util.List<com.edu.mum.hbs.entity.CustRoomDetails> getCustomerRoomFullFromToDate(java.lang.String fromDate, java.lang.String toDate) {
    javax.ws.rs.client.WebTarget path = query.path(((("/getCustomerRoomFullFromToDate/" + fromDate) + "/") + toDate));
    path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<com.edu.mum.hbs.entity.CustRoomDetails>>() {    });
    java.util.List<com.edu.mum.hbs.entity.CustRoomDetails> customerAndRooms = path.request().get().readEntity(new javax.ws.rs.core.GenericType<java.util.List<com.edu.mum.hbs.entity.CustRoomDetails>>() {    });
    return customerAndRooms;
}