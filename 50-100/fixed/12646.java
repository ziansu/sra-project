public java.util.List<msa.application.service.domain.CausaRotturaCristalliDTO> getCauseRotturaCristalli() throws msa.application.exceptions.InternalMsaException {
    try {
        return converter.convertList(domainRepository.getElencoCauseRotturaCristalli(), msa.application.service.domain.CausaRotturaCristalliDTO.class);
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(e, buildErrorMessageByText(MessageType.ERROR, ((msa.application.commons.Constants.DEFAULT_DOMAIN_ERROR_MESSAGE) + "causa rottura cristalli")));
    }
}