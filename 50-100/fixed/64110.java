private java.util.List<se.riv.clinicalprocess.healthcond.rehabilitation.v1.IntygsData> getIntygsData(se.inera.intyg.clinicalprocess.healthcond.rehabilitation.listactivesickleavesforcareunit.v1.ListActiveSickLeavesForCareUnitResponseType responseType, java.lang.String errorMessage) {
    if (responseType == null) {
        se.inera.intyg.rehabstod.integration.it.service.IntygstjanstIntegrationServiceImpl.LOG.error(errorMessage);
        throw new se.inera.intyg.rehabstod.integration.it.exception.IntygstjanstIntegrationException();
    }
    if ((responseType.getResultCode()) != (se.inera.intyg.clinicalprocess.healthcond.rehabilitation.listactivesickleavesforcareunit.v1.ResultCodeEnum.OK)) {
        se.inera.intyg.rehabstod.integration.it.service.IntygstjanstIntegrationServiceImpl.LOG.error(errorMessage, responseType.getResultCode(), responseType.getComment());
        throw new se.inera.intyg.rehabstod.integration.it.exception.IntygstjanstIntegrationException();
    }
    return responseType.getIntygsLista().getIntygsData();
}