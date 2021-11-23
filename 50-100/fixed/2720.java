@ge.edu.freeuni.sdp.iot.router.POST
@ge.edu.freeuni.sdp.iot.router.Path(value = "/connect")
public javax.ws.rs.core.Response create(@ge.edu.freeuni.sdp.iot.router.PathParam(value = "house_id")
java.lang.String houseId, ge.edu.freeuni.sdp.iot.router.MacObject macObject) {
    ge.edu.freeuni.sdp.iot.router.Houses houses = ge.edu.freeuni.sdp.iot.router.Houses.getInstance();
    ge.edu.freeuni.sdp.iot.router.House house = getHouseById(houses, houseId);
    final java.lang.String uniqueId = java.util.UUID.randomUUID().toString();
    macObject.setId(uniqueId);
    house.addMac(macObject);
    return addHeaders(javax.ws.rs.core.Response.ok().entity(macObject.toString()));
}