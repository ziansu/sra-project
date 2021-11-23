public se.inera.webcert.service.intyg.dto.IntygServiceResult storeIntyg(se.inera.webcert.persistence.utkast.model.Omsandning omsandning) {
    se.inera.webcert.persistence.utkast.model.Utkast utkast = utkastRepository.findOne(omsandning.getIntygId());
    if (utkast == null) {
        se.inera.webcert.service.intyg.IntygServiceImpl.LOG.warn("Could not store intyg in Intygstjansten, no draft found for intyg id '{}'", omsandning.getIntygId());
        return se.inera.webcert.service.intyg.dto.IntygServiceResult.FAILED;
    }
    return storeIntyg(utkast, omsandning);
}