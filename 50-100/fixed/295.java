public static java.util.List<com.salesforce.dva.argus.ws.dto.AlertDto> transformToDtoNoContent(java.util.List<com.salesforce.dva.argus.entity.Alert> alerts) {
    if (alerts == null) {
        throw new javax.ws.rs.WebApplicationException("Null entity object cannot be converted to Dto object.", javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR);
    }
    java.util.List<com.salesforce.dva.argus.ws.dto.AlertDto> result = new java.util.ArrayList<com.salesforce.dva.argus.ws.dto.AlertDto>();
    for (com.salesforce.dva.argus.entity.Alert alert : alerts) {
        result.add(com.salesforce.dva.argus.ws.dto.AlertDto.transformToDtoNoContent(alert));
    }
    return result;
}