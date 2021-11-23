@ge.edu.freeuni.sdp.iot.router.DELETE
@ge.edu.freeuni.sdp.iot.router.Path(value = "/connect/{mac_id}")
public javax.ws.rs.core.Response delete(@ge.edu.freeuni.sdp.iot.router.PathParam(value = "house_id")
java.lang.String houseId, @ge.edu.freeuni.sdp.iot.router.PathParam(value = "mac_id")
java.lang.String macId) {
    ge.edu.freeuni.sdp.iot.router.Houses houses = ge.edu.freeuni.sdp.iot.router.Houses.getInstance();
    ge.edu.freeuni.sdp.iot.router.House house = getHouseById(houses, houseId);
    boolean succ = house.removeMac(macId);
    if (succ)
        return addHeaders(javax.ws.rs.core.Response.ok());
    else
        return addHeaders(javax.ws.rs.core.Response.status(404));
    
}