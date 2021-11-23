public java.util.List<msa.application.service.domain.ComuneDTO> getElencoComuni(java.lang.Integer idNazione, java.lang.Integer idProvincia, java.lang.String desc) throws msa.application.exceptions.InternalMsaException {
    try {
        return converter.convertList(domainRepository.getElencoComuni(idNazione, idProvincia, desc), msa.application.service.domain.ComuneDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "comuni")));
    }
}