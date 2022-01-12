@ge.edu.freeuni.sdp.iot.router.GET
@ge.edu.freeuni.sdp.iot.router.Path(value = "/available")
public javax.ws.rs.core.Response get(@ge.edu.freeuni.sdp.iot.router.PathParam(value = "house_id")
java.lang.String houseId) {
    ge.edu.freeuni.sdp.iot.router.Houses houses = ge.edu.freeuni.sdp.iot.router.Houses.getInstance();
    ge.edu.freeuni.sdp.iot.router.House house = getHouseById(houses, houseId);
    return addHeaders(javax.ws.rs.core.Response.ok().entity((("{\"atHome\":" + (house.isAnynoneAtHome())) + "}")));
}