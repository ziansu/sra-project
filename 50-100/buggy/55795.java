@java.lang.Override
public com.castlemock.core.mock.soap.model.project.dto.SoapOperationDto updateSoapOperation(final java.lang.String soapProjectId, final java.lang.String soapPortId, final java.lang.String soapOperationId, final com.castlemock.core.mock.soap.model.project.dto.SoapOperationDto soapOperationDto) {
    com.castlemock.web.mock.soap.model.project.repository.SoapOperation soapOperation = findSoapOperationType(soapProjectId, soapPortId, soapOperationId);
    soapOperation.setStatus(soapOperationDto.getStatus());
    soapOperation.setForwardedEndpoint(soapOperationDto.getForwardedEndpoint());
    soapOperation.setResponseStrategy(soapOperationDto.getResponseStrategy());
    return null;
}