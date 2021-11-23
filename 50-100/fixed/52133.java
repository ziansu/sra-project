public java.lang.Object createDemand(java.lang.String url, java.lang.String demand) {
    java.lang.Object response = null;
    try {
        response = restTemaplate.postForObject(url, demand, java.lang.Object.class);
    } catch (java.lang.Exception e) {
        org.egov.citizen.service.CitizenService.LOGGER.error("Couldn't create demand: ", e);
        throw new org.egov.citizen.exception.CustomException(java.lang.Integer.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.toString()), org.egov.citizen.config.CitizenServiceConstants.DEMAND_NOT_CREATED_MSG, org.egov.citizen.config.CitizenServiceConstants.DEMAND_NOT_CREATED_DESC);
    }
    org.egov.citizen.service.CitizenService.LOGGER.info(("Demand creation for app fee response: " + response));
    return response;
}