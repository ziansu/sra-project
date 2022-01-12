public java.util.List<msa.application.service.domain.AutoritaDTO> getElencoAutorita() throws msa.application.exceptions.InternalMsaException {
    java.util.List<msa.application.service.domain.AutoritaDO> result = null;
    try {
        result = domainRepository.getElencoAutorita();
        return converter.convertList(result, msa.application.service.domain.AutoritaDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "autorità")));
    }
}