public java.util.List<msa.application.service.domain.NazioneDTO> getElencoNazioni(java.lang.String nome) throws msa.application.exceptions.InternalMsaException {
    try {
        java.util.List<msa.application.service.domain.NazioneDO> result = domainRepository.getListaNazioni(nome);
        return converter.convertList(result, msa.application.service.domain.NazioneDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "nazioni")));
    }
}