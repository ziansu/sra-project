@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "/summary")
public com.orbis.orbis180.dataStructures.SummaryData sendSummary() {
    dbStore = new com.orbis.orbis180.storage.DatabaseDAO();
    dbStore.init(false);
    com.orbis.orbis180.dataStructures.SummaryData retVal = new com.orbis.orbis180.dataStructures.SummaryData();
    retVal.A_V_G_QueryTime = this.dbStore.getAvgQueryTime().toString();
    this.dbStore.uninit();
    return retVal;
}