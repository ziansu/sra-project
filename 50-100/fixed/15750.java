@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/save")
@javax.ws.rs.Consumes(value = "application/x-www-form-urlencoded")
public javax.ws.rs.core.Response saveOrUpdateProduct(@javax.ws.rs.FormParam(value = "id")
java.lang.String id, @javax.ws.rs.FormParam(value = "name")
java.lang.String name, @javax.ws.rs.FormParam(value = "price")
java.lang.String price, @javax.ws.rs.FormParam(value = "quantity")
java.lang.String quantity, @javax.ws.rs.FormParam(value = "unit")
java.lang.String unit) {
    java.lang.Double quantityDouble = com.unq.estip.pada.utils.Utilities.parseDouble(quantity);
    com.unq.estip.pada.model.Unit unitEnum = com.unq.estip.pada.model.Unit.getEnum(unit);
    productService.save(id, name, java.lang.Double.parseDouble(price), quantityDouble, unitEnum);
    return javax.ws.rs.core.Response.ok().header("Access-Control-Allow-Origin", "*").build();
}