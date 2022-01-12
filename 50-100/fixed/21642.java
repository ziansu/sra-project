@java.lang.Override
public void createRaavareBatch(DTO.RaavareBatchDTO raavarebatch) throws interfaces.DALException {
    query = ((((("Call opret_raavarebatch(" + (raavarebatch.getRbID())) + ", ") + (raavarebatch.getRaavareID())) + ", ") + (raavarebatch.getMaengde())) + ")";
    c.doQuery(query);
}