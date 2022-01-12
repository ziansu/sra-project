public java.util.List<msa.application.service.domain.ComuneDTO> getElencoComuni(java.lang.Integer idNazione, java.lang.Integer idProvincia, java.lang.String desc) throws msa.application.exceptions.InternalMsaException {
    try {
        java.util.List<msa.application.service.domain.ComuneDO> result = domainRepository.getElencoComuni(idNazione, idProvincia, desc);
        return converter.convertList(result, msa.application.service.domain.ComuneDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "comuni")));
    }
}