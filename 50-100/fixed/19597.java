@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/historicweights")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<com.stockwaage.service.resources.weights.WeightRepresentation> historicWeights(@javax.ws.rs.QueryParam(value = "loadCell")
java.lang.String loadCell) {
    if (!(com.google.common.base.Strings.isNullOrEmpty(loadCell))) {
        return weightAssembler.assemble(weightDao.allHistoricWeights());
    }
    return weightAssembler.assemble(weightDao.historicWeightsBy(loadCell));
}