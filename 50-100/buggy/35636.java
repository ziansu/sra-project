private void setCorrelationId(org.ovirt.engine.core.common.action.VdcActionParametersBase params) {
    java.util.List<java.lang.String> correlationIds = httpHeaders.getRequestHeader(org.ovirt.engine.api.restapi.resource.BackendResource.CORRELATION_ID);
    if ((correlationIds != null) && ((correlationIds.size()) > 0)) {
        params.setCorrelationId(correlationIds.get(0));
    }
}