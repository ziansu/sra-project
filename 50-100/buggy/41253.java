@java.lang.Override
public com.wso2telco.core.pcrservice.Returnable getMsisdnByPcr(java.lang.String sectorId, java.lang.String pcr) throws com.wso2telco.core.pcrservice.exception.PCRException {
    try {
        com.wso2telco.core.pcrservice.persistable.UUIDPCRService uuidpcrService = new com.wso2telco.core.pcrservice.persistable.UUIDPCRService();
        uuid = uuidpcrService.getMsisdnByPcr(sectorId, pcr);
    } catch (java.lang.Exception e) {
        com.wso2telco.core.pcrservice.persistable.UUIDPCRGenarator.log.error(com.wso2telco.core.pcrservice.persistable.UUIDPCRGenarator.ERROR_IN_RECIEVING_MSISDN, e);
        throw new com.wso2telco.core.pcrservice.exception.PCRException("error in receiving a PCR");
    }
    return new com.wso2telco.core.pcrservice.Returnable() {
        @java.lang.Override
        public java.lang.String getID() {
            return uuid;
        }
    };
}