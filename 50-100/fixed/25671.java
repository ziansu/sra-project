@java.lang.Override
public com.wso2telco.core.pcrservice.Returnable getExistingPCR(com.wso2telco.core.pcrservice.model.RequestDTO dto) throws com.wso2telco.core.pcrservice.exception.PCRException {
    try {
        com.wso2telco.core.pcrservice.persistable.UUIDPCRService uuidpcrService = new com.wso2telco.core.pcrservice.persistable.UUIDPCRService();
        uuid = uuidpcrService.getExistingPCR(dto);
    } catch (java.lang.Exception e) {
        com.wso2telco.core.pcrservice.persistable.UUIDPCRGenarator.log.error(com.wso2telco.core.pcrservice.persistable.UUIDPCRGenarator.ERROR_IN_RECEIVING_A_PCR, e);
        throw new com.wso2telco.core.pcrservice.exception.PCRException(com.wso2telco.core.pcrservice.persistable.UUIDPCRGenarator.ERROR_IN_RECEIVING_A_PCR);
    }
    return new com.wso2telco.core.pcrservice.Returnable() {
        @java.lang.Override
        public java.lang.String getID() {
            return uuid;
        }
    };
}