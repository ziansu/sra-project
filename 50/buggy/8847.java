@ge.edu.freeuni.sdp.iot.router.GET
@ge.edu.freeuni.sdp.iot.router.Path(value = "/addresses")
public javax.ws.rs.core.Response getAddresses(@ge.edu.freeuni.sdp.iot.router.PathParam(value = "house_id")
int houseId) {
    ge.edu.freeuni.sdp.iot.router.Houses houses = ge.edu.freeuni.sdp.iot.router.Houses.getInstance();
    ge.edu.freeuni.sdp.iot.router.House house = getHouseById(houses, houseId);
    return javax.ws.rs.core.Response.ok().entity(houses.toString()).build();
}