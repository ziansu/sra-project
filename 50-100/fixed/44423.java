@java.lang.Override
public void run() {
    javax.ws.rs.core.Response response;
    com.maschel.lca.message.response.SensorValueMessage sensorValueMessage = getSensorResult();
    if (sensorValueMessage != null) {
        response = javax.ws.rs.core.Response.status(Response.Status.OK).entity(sensorValueMessage).build();
    }else {
        response = javax.ws.rs.core.Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
    asyncResponse.resume(response);
}