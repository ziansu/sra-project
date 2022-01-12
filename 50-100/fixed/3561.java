public static org.votingsystem.dto.voting.CertValidationDto validationRequest(java.lang.String nif, java.lang.String deviceId) {
    org.votingsystem.dto.voting.CertValidationDto certValidationDto = new org.votingsystem.dto.voting.CertValidationDto();
    certValidationDto.setNif(nif);
    certValidationDto.setDeviceId(deviceId);
    certValidationDto.setUUID(java.util.UUID.randomUUID().toString());
    return certValidationDto;
}