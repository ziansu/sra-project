public java.util.List<msa.application.service.domain.TipoVeicoloDTO> getElencoTipoVeicoli() throws msa.application.exceptions.InternalMsaException {
    try {
        return converter.convertList(domainRepository.getElencoTipoVeicoli(), msa.application.service.domain.TipoVeicoloDTO.class);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "tipologia veicolo ")));
    }
}