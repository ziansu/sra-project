public java.util.List<msa.application.service.domain.ProvinciaDTO> getElencoProvince(java.lang.Integer idNazione, java.lang.String descProvincia) throws msa.application.exceptions.InternalMsaException {
    try {
        java.util.List<msa.application.service.domain.ProvinciaDO> result = domainRepository.getElencoProvince(idNazione, descProvincia);
        return converter.convertList(result, msa.application.service.domain.ProvinciaDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "provincie")));
    }
}