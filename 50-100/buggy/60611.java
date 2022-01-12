@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{manufacturerId}")
public javax.ws.rs.core.Response getTaskById(@javax.ws.rs.PathParam(value = "manufacturerId")
int manufacturerId) {
    try {
        at.airdb.dao.ManufacturerDAO dao = new at.airdb.dao.ManufacturerDAO();
        at.airdb.vo.Manufacturer manufacturer = dao.getManufacturerById(manufacturerId);
        return javax.ws.rs.core.Response.ok().entity(manufacturer).build();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
        return javax.ws.rs.core.Response.status(404).build();
    }
}