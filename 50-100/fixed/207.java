@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/billingRegion")
@javax.ws.rs.Produces(value = "application/json")
public org.oscarehr.ws.rest.to.GenericRESTResponse billingRegion() {
    boolean billRegionSet = true;
    java.lang.String billRegion = oscarProperties.getProperty("billregion", "").trim().toUpperCase();
    if (billRegion.isEmpty()) {
        billRegionSet = false;
    }
    return new org.oscarehr.ws.rest.to.GenericRESTResponse(billRegionSet, billRegion);
}